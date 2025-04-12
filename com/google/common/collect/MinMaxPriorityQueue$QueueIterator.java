/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.MinMaxPriorityQueue;
import com.google.common.collect.MinMaxPriorityQueue$1;
import com.google.common.collect.MinMaxPriorityQueue$MoveDesc;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

class MinMaxPriorityQueue$QueueIterator
implements Iterator {
    private boolean canRemove;
    private int cursor;
    private int expectedModCount;
    private Queue forgetMeNot;
    private Object lastFromForgetMeNot;
    private int nextCursor;
    private List skipMe;
    final /* synthetic */ MinMaxPriorityQueue this$0;

    private MinMaxPriorityQueue$QueueIterator(MinMaxPriorityQueue minMaxPriorityQueue) {
        int n3;
        int n4;
        this.this$0 = minMaxPriorityQueue;
        this.cursor = n4 = -1;
        this.nextCursor = n4;
        this.expectedModCount = n3 = MinMaxPriorityQueue.access$700(minMaxPriorityQueue);
    }

    public /* synthetic */ MinMaxPriorityQueue$QueueIterator(MinMaxPriorityQueue minMaxPriorityQueue, MinMaxPriorityQueue$1 minMaxPriorityQueue$1) {
        this(minMaxPriorityQueue);
    }

    private void checkModCount() {
        int n3;
        Object object = this.this$0;
        int n4 = MinMaxPriorityQueue.access$700((MinMaxPriorityQueue)object);
        if (n4 == (n3 = this.expectedModCount)) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    private boolean foundAndRemovedExactReference(Iterable object, Object object2) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            if (e2 != object2) continue;
            object.remove();
            return true;
        }
        return false;
    }

    private void nextNotInSkipMe(int n3) {
        int n4 = this.nextCursor;
        if (n4 < n3) {
            Collection collection = this.skipMe;
            if (collection != null) {
                Object object;
                while (n3 < (n4 = ((MinMaxPriorityQueue)(collection = this.this$0)).size()) && (n4 = (int)(this.foundAndRemovedExactReference(collection = this.skipMe, object = this.this$0.elementData(n3)) ? 1 : 0)) != 0) {
                    ++n3;
                }
            }
            this.nextCursor = n3;
        }
    }

    private boolean removeExact(Object object) {
        Object object2;
        int n3;
        for (int i3 = 0; i3 < (n3 = MinMaxPriorityQueue.access$600((MinMaxPriorityQueue)(object2 = this.this$0))); ++i3) {
            object2 = MinMaxPriorityQueue.access$500(this.this$0)[i3];
            if (object2 != object) continue;
            this.this$0.removeAt(i3);
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        Queue queue;
        this.checkModCount();
        int n3 = this.cursor;
        int n4 = 1;
        this.nextNotInSkipMe(n3 += n4);
        n3 = this.nextCursor;
        MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
        int n7 = minMaxPriorityQueue.size();
        if (n3 >= n7 && ((queue = this.forgetMeNot) == null || (n3 = (int)(queue.isEmpty() ? 1 : 0)) != 0)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public Object next() {
        this.checkModCount();
        int n3 = this.cursor;
        int n4 = 1;
        this.nextNotInSkipMe(n3 += n4);
        n3 = this.nextCursor;
        MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
        int n7 = minMaxPriorityQueue.size();
        if (n3 < n7) {
            this.cursor = n3 = this.nextCursor;
            this.canRemove = n4;
            return this.this$0.elementData(n3);
        }
        Object object = this.forgetMeNot;
        if (object != null) {
            this.cursor = n3 = this.this$0.size();
            this.lastFromForgetMeNot = object = this.forgetMeNot.poll();
            if (object != null) {
                this.canRemove = n4;
                return object;
            }
        }
        object = new NoSuchElementException("iterator moved past last element in queue.");
        throw object;
    }

    public void remove() {
        int n3;
        CollectPreconditions.checkRemove(this.canRemove);
        this.checkModCount();
        Object object = null;
        this.canRemove = false;
        this.expectedModCount = n3 = this.expectedModCount + 1;
        n3 = this.cursor;
        Collection<Object> collection = this.this$0;
        int n4 = ((MinMaxPriorityQueue)collection).size();
        if (n3 < n4) {
            object = this.this$0;
            n4 = this.cursor;
            if ((object = ((MinMaxPriorityQueue)object).removeAt(n4)) != null) {
                Object object2;
                collection = this.forgetMeNot;
                if (collection == null || (collection = this.skipMe) == null) {
                    collection = new Collection<Object>();
                    this.forgetMeNot = collection;
                    int n7 = 3;
                    collection = new Collection<Object>(n7);
                    this.skipMe = collection;
                }
                if ((n4 = (int)(this.foundAndRemovedExactReference(collection = this.skipMe, object2 = ((MinMaxPriorityQueue$MoveDesc)object).toTrickle) ? 1 : 0)) == 0) {
                    collection = this.forgetMeNot;
                    object2 = ((MinMaxPriorityQueue$MoveDesc)object).toTrickle;
                    collection.add(object2);
                }
                if ((n4 = (int)(this.foundAndRemovedExactReference(collection = this.forgetMeNot, object2 = ((MinMaxPriorityQueue$MoveDesc)object).replaced) ? 1 : 0)) == 0) {
                    collection = this.skipMe;
                    object = ((MinMaxPriorityQueue$MoveDesc)object).replaced;
                    collection.add(object);
                }
            }
            this.cursor = n3 = this.cursor + -1;
            this.nextCursor = n3 = this.nextCursor + -1;
        } else {
            object = this.lastFromForgetMeNot;
            Objects.requireNonNull(object);
            Preconditions.checkState(this.removeExact(object));
            n3 = 0;
            object = null;
            this.lastFromForgetMeNot = null;
        }
    }
}

