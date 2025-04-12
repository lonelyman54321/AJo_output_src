/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.MinMaxPriorityQueue$1;
import com.google.common.collect.MinMaxPriorityQueue$Builder;
import com.google.common.collect.MinMaxPriorityQueue$Heap;
import com.google.common.collect.MinMaxPriorityQueue$MoveDesc;
import com.google.common.collect.MinMaxPriorityQueue$QueueIterator;
import com.google.common.collect.Ordering;
import com.google.common.math.IntMath;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class MinMaxPriorityQueue
extends AbstractQueue {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 0x55555555;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue$Heap maxHeap;
    final int maximumSize;
    private final MinMaxPriorityQueue$Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    private MinMaxPriorityQueue(MinMaxPriorityQueue$Builder objectArray, int n3) {
        int n4;
        MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap;
        MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap2;
        Ordering ordering = MinMaxPriorityQueue$Builder.access$200((MinMaxPriorityQueue$Builder)objectArray);
        this.minHeap = minMaxPriorityQueue$Heap2 = new MinMaxPriorityQueue$Heap(this, ordering);
        ordering = ordering.reverse();
        this.maxHeap = minMaxPriorityQueue$Heap = new MinMaxPriorityQueue$Heap(this, ordering);
        minMaxPriorityQueue$Heap2.otherHeap = minMaxPriorityQueue$Heap;
        minMaxPriorityQueue$Heap.otherHeap = minMaxPriorityQueue$Heap2;
        this.maximumSize = n4 = MinMaxPriorityQueue$Builder.access$300((MinMaxPriorityQueue$Builder)objectArray);
        objectArray = new Object[n3];
        this.queue = objectArray;
    }

    public /* synthetic */ MinMaxPriorityQueue(MinMaxPriorityQueue$Builder minMaxPriorityQueue$Builder, int n3, MinMaxPriorityQueue$1 minMaxPriorityQueue$1) {
        this(minMaxPriorityQueue$Builder, n3);
    }

    public static /* synthetic */ Object[] access$500(MinMaxPriorityQueue minMaxPriorityQueue) {
        return minMaxPriorityQueue.queue;
    }

    public static /* synthetic */ int access$600(MinMaxPriorityQueue minMaxPriorityQueue) {
        return minMaxPriorityQueue.size;
    }

    public static /* synthetic */ int access$700(MinMaxPriorityQueue minMaxPriorityQueue) {
        return minMaxPriorityQueue.modCount;
    }

    private int calculateNewCapacity() {
        Object[] objectArray = this.queue;
        int n3 = objectArray.length;
        int n4 = 64;
        if (n3 < n4) {
            n3 = (n3 + 1) * 2;
        } else {
            n3 /= 2;
            n4 = 3;
            n3 = IntMath.checkedMultiply(n3, n4);
        }
        n4 = this.maximumSize;
        return MinMaxPriorityQueue.capAtMaximumSize(n3, n4);
    }

    private static int capAtMaximumSize(int n3, int n4) {
        return Math.min(n3 + -1, n4) + 1;
    }

    public static MinMaxPriorityQueue create() {
        Ordering ordering = Ordering.natural();
        MinMaxPriorityQueue$Builder minMaxPriorityQueue$Builder = new MinMaxPriorityQueue$Builder(ordering, null);
        return minMaxPriorityQueue$Builder.create();
    }

    public static MinMaxPriorityQueue create(Iterable iterable) {
        Ordering ordering = Ordering.natural();
        MinMaxPriorityQueue$Builder minMaxPriorityQueue$Builder = new MinMaxPriorityQueue$Builder(ordering, null);
        return minMaxPriorityQueue$Builder.create(iterable);
    }

    public static MinMaxPriorityQueue$Builder expectedSize(int n3) {
        Ordering ordering = Ordering.natural();
        MinMaxPriorityQueue$Builder minMaxPriorityQueue$Builder = new MinMaxPriorityQueue$Builder(ordering, null);
        return minMaxPriorityQueue$Builder.expectedSize(n3);
    }

    private MinMaxPriorityQueue$MoveDesc fillHole(int n3, Object object) {
        int n4;
        Object object2 = this.heapForIndex(n3);
        int n7 = ((MinMaxPriorityQueue$Heap)object2).bubbleUpAlternatingLevels(n4 = ((MinMaxPriorityQueue$Heap)object2).fillHoleAt(n3), object);
        if (n7 == n4) {
            return ((MinMaxPriorityQueue$Heap)object2).tryCrossOverAndBubbleUp(n3, n4, object);
        }
        if (n7 < n3) {
            Object object3 = this.elementData(n3);
            object2 = new MinMaxPriorityQueue$MoveDesc(object, object3);
        } else {
            object2 = null;
        }
        return object2;
    }

    private int getMaxElementIndex() {
        int n3 = this.size;
        int n4 = 1;
        if (n3 != n4) {
            MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap;
            int n7 = 2;
            if (n3 != n7 && (n3 = (minMaxPriorityQueue$Heap = this.maxHeap).compareElements(n4, n7)) > 0) {
                n4 = 2;
            }
            return n4;
        }
        return 0;
    }

    private void growIfNeeded() {
        int n3 = this.size;
        Object[] objectArray = this.queue;
        int n4 = objectArray.length;
        if (n3 > n4) {
            n3 = this.calculateNewCapacity();
            Object[] objectArray2 = new Object[n3];
            objectArray = this.queue;
            int n7 = objectArray.length;
            System.arraycopy(objectArray, 0, objectArray2, 0, n7);
            this.queue = objectArray2;
        }
    }

    private MinMaxPriorityQueue$Heap heapForIndex(int n3) {
        MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap = (n3 = (int)(MinMaxPriorityQueue.isEvenLevel(n3) ? 1 : 0)) != 0 ? this.minHeap : this.maxHeap;
        return minMaxPriorityQueue$Heap;
    }

    public static int initialQueueSize(int n3, int n4, Iterable iterable) {
        int n7 = -1;
        if (n3 == n7) {
            n3 = 11;
        }
        if ((n7 = iterable instanceof Collection) != 0) {
            iterable = (Collection)iterable;
            int n8 = iterable.size();
            n3 = Math.max(n3, n8);
        }
        return MinMaxPriorityQueue.capAtMaximumSize(n3, n4);
    }

    public static boolean isEvenLevel(int n3) {
        int n4 = 1;
        int n7 = (n3 = ~(~(n3 + n4))) > 0 ? 1 : 0;
        String string2 = "negative index";
        Preconditions.checkState(n7 != 0, string2);
        n7 = 0x55555555 & n3;
        int n8 = -1431655766;
        if (n7 <= (n3 &= n8)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public static MinMaxPriorityQueue$Builder maximumSize(int n3) {
        Ordering ordering = Ordering.natural();
        MinMaxPriorityQueue$Builder minMaxPriorityQueue$Builder = new MinMaxPriorityQueue$Builder(ordering, null);
        return minMaxPriorityQueue$Builder.maximumSize(n3);
    }

    public static MinMaxPriorityQueue$Builder orderedBy(Comparator comparator) {
        MinMaxPriorityQueue$Builder minMaxPriorityQueue$Builder = new MinMaxPriorityQueue$Builder(comparator, null);
        return minMaxPriorityQueue$Builder;
    }

    private Object removeAndGet(int n3) {
        Object object = this.elementData(n3);
        this.removeAt(n3);
        return object;
    }

    public boolean add(Object object) {
        this.offer(object);
        return true;
    }

    public boolean addAll(Collection object) {
        boolean bl2;
        object = object.iterator();
        boolean bl3 = false;
        Object var3_3 = null;
        while (bl2 = object.hasNext()) {
            var3_3 = object.next();
            this.offer((Object)var3_3);
            bl3 = true;
        }
        return bl3;
    }

    public int capacity() {
        return this.queue.length;
    }

    public void clear() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            Object[] objectArray = this.queue;
            objectArray[i3] = null;
        }
        this.size = 0;
    }

    public Comparator comparator() {
        return this.minHeap.ordering;
    }

    public Object elementData(int n3) {
        Object object = this.queue[n3];
        Objects.requireNonNull(object);
        return object;
    }

    public boolean isIntact() {
        int n3;
        boolean bl2 = true;
        for (int i3 = 1; i3 < (n3 = this.size); ++i3) {
            MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap = this.heapForIndex(i3);
            n3 = (int)(MinMaxPriorityQueue$Heap.access$400(minMaxPriorityQueue$Heap, i3) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return bl2;
    }

    public Iterator iterator() {
        MinMaxPriorityQueue$QueueIterator minMaxPriorityQueue$QueueIterator = new MinMaxPriorityQueue$QueueIterator(this, null);
        return minMaxPriorityQueue$QueueIterator;
    }

    public boolean offer(Object object) {
        Object object2;
        int n3;
        Preconditions.checkNotNull(object);
        int n4 = this.modCount;
        int n7 = 1;
        this.modCount = n4 += n7;
        n4 = this.size;
        this.size = n3 = n4 + 1;
        this.growIfNeeded();
        MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap = this.heapForIndex(n4);
        minMaxPriorityQueue$Heap.bubbleUp(n4, object);
        n4 = this.size;
        n3 = this.maximumSize;
        if (n4 > n3 && (object2 = this.pollLast()) == object) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public Object peek() {
        Object object;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            bl2 = false;
            object = null;
        } else {
            bl2 = false;
            object = this.elementData(0);
        }
        return object;
    }

    public Object peekFirst() {
        return this.peek();
    }

    public Object peekLast() {
        Object object;
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = 0;
            object = null;
        } else {
            n3 = this.getMaxElementIndex();
            object = this.elementData(n3);
        }
        return object;
    }

    public Object poll() {
        Object object;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            bl2 = false;
            object = null;
        } else {
            bl2 = false;
            object = this.removeAndGet(0);
        }
        return object;
    }

    public Object pollFirst() {
        return this.poll();
    }

    public Object pollLast() {
        Object object;
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = 0;
            object = null;
        } else {
            n3 = this.getMaxElementIndex();
            object = this.removeAndGet(n3);
        }
        return object;
    }

    public MinMaxPriorityQueue$MoveDesc removeAt(int n3) {
        int n4 = this.size;
        Preconditions.checkPositionIndex(n3, n4);
        this.modCount = n4 = this.modCount + 1;
        this.size = n4 = this.size + -1;
        Object object = null;
        if (n4 == n3) {
            this.queue[n4] = null;
            return null;
        }
        Object object2 = this.elementData(n4);
        int n7 = this.size;
        MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap = this.heapForIndex(n7);
        if ((n7 = minMaxPriorityQueue$Heap.swapWithConceptuallyLastElement(object2)) == n3) {
            Object[] objectArray = this.queue;
            n4 = this.size;
            objectArray[n4] = null;
            return null;
        }
        int n8 = this.size;
        Object object3 = this.elementData(n8);
        Object[] objectArray = this.queue;
        int n10 = this.size;
        objectArray[n10] = null;
        object = this.fillHole(n3, object3);
        if (n7 < n3) {
            if (object == null) {
                MinMaxPriorityQueue$MoveDesc minMaxPriorityQueue$MoveDesc = new MinMaxPriorityQueue$MoveDesc(object2, object3);
                return minMaxPriorityQueue$MoveDesc;
            }
            object = ((MinMaxPriorityQueue$MoveDesc)object).replaced;
            MinMaxPriorityQueue$MoveDesc minMaxPriorityQueue$MoveDesc = new MinMaxPriorityQueue$MoveDesc(object2, object);
            return minMaxPriorityQueue$MoveDesc;
        }
        return object;
    }

    public Object removeFirst() {
        return this.remove();
    }

    public Object removeLast() {
        int n3 = this.isEmpty();
        if (n3 == 0) {
            n3 = this.getMaxElementIndex();
            return this.removeAndGet(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public int size() {
        return this.size;
    }

    public Object[] toArray() {
        int n3 = this.size;
        Object[] objectArray = new Object[n3];
        System.arraycopy(this.queue, 0, objectArray, 0, n3);
        return objectArray;
    }
}

