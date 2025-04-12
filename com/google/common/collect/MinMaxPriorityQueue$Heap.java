/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.MinMaxPriorityQueue;
import com.google.common.collect.MinMaxPriorityQueue$MoveDesc;
import com.google.common.collect.Ordering;

class MinMaxPriorityQueue$Heap {
    final Ordering ordering;
    MinMaxPriorityQueue$Heap otherHeap;
    final /* synthetic */ MinMaxPriorityQueue this$0;

    public MinMaxPriorityQueue$Heap(MinMaxPriorityQueue minMaxPriorityQueue, Ordering ordering) {
        this.this$0 = minMaxPriorityQueue;
        this.ordering = ordering;
    }

    public static /* synthetic */ boolean access$400(MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap, int n3) {
        return minMaxPriorityQueue$Heap.verifyIndex(n3);
    }

    private int getGrandparentIndex(int n3) {
        n3 = this.getParentIndex(n3);
        return this.getParentIndex(n3);
    }

    private int getLeftChildIndex(int n3) {
        return n3 * 2 + 1;
    }

    private int getParentIndex(int n3) {
        return (n3 + -1) / 2;
    }

    private int getRightChildIndex(int n3) {
        return n3 * 2 + 2;
    }

    private boolean verifyIndex(int n3) {
        MinMaxPriorityQueue minMaxPriorityQueue;
        int n4;
        int n7 = this.getLeftChildIndex(n3);
        if (n7 < (n4 = MinMaxPriorityQueue.access$600(minMaxPriorityQueue = this.this$0))) {
            n7 = this.getLeftChildIndex(n3);
            if ((n7 = this.compareElements(n3, n7)) > 0) {
                return false;
            }
        }
        if ((n7 = this.getRightChildIndex(n3)) < (n4 = MinMaxPriorityQueue.access$600(minMaxPriorityQueue = this.this$0))) {
            n7 = this.getRightChildIndex(n3);
            if ((n7 = this.compareElements(n3, n7)) > 0) {
                return false;
            }
        }
        if (n3 > 0) {
            n7 = this.getParentIndex(n3);
            if ((n7 = this.compareElements(n3, n7)) > 0) {
                return false;
            }
        }
        return n3 <= (n7 = 2) || (n3 = this.compareElements(n7 = this.getGrandparentIndex(n3), n3)) <= 0;
    }

    public void bubbleUp(int n3, Object object) {
        MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap;
        int n4 = this.crossOverUp(n3, object);
        if (n4 == n3) {
            n4 = n3;
            minMaxPriorityQueue$Heap = this;
        } else {
            minMaxPriorityQueue$Heap = this.otherHeap;
        }
        minMaxPriorityQueue$Heap.bubbleUpAlternatingLevels(n4, object);
    }

    public int bubbleUpAlternatingLevels(int n3, Object object) {
        Object object2;
        Object[] objectArray;
        int n4;
        int n7;
        while (n3 > (n7 = 2) && (n4 = (objectArray = this.ordering).compare(object2 = this.this$0.elementData(n7 = this.getGrandparentIndex(n3)), object)) > 0) {
            objectArray = MinMaxPriorityQueue.access$500(this.this$0);
            objectArray[n3] = object2;
            n3 = n7;
        }
        MinMaxPriorityQueue.access$500((MinMaxPriorityQueue)this.this$0)[n3] = object;
        return n3;
    }

    public int compareElements(int n3, int n4) {
        Ordering ordering = this.ordering;
        Object object = this.this$0.elementData(n3);
        Object object2 = this.this$0.elementData(n4);
        return ordering.compare(object, object2);
    }

    public int crossOver(int n3, Object object) {
        Object object2;
        Object[] objectArray;
        int n4;
        int n7 = this.findMinChild(n3);
        if (n7 > 0 && (n4 = (objectArray = this.ordering).compare(object2 = this.this$0.elementData(n7), object)) < 0) {
            objectArray = MinMaxPriorityQueue.access$500(this.this$0);
            objectArray[n3] = object2 = this.this$0.elementData(n7);
            MinMaxPriorityQueue.access$500((MinMaxPriorityQueue)this.this$0)[n7] = object;
            return n7;
        }
        return this.crossOverUp(n3, object);
    }

    public int crossOverUp(int n3, Object object) {
        Ordering ordering;
        int n4;
        if (n3 == 0) {
            MinMaxPriorityQueue.access$500((MinMaxPriorityQueue)this.this$0)[0] = object;
            return 0;
        }
        int n7 = this.getParentIndex(n3);
        Object object2 = this.this$0.elementData(n7);
        if (n7 != 0) {
            Object object3;
            Object object4;
            int n8;
            int n10;
            n4 = this.getParentIndex(n7);
            if ((n4 = this.getRightChildIndex(n4)) != n7 && (n10 = this.getLeftChildIndex(n4)) >= (n8 = MinMaxPriorityQueue.access$600((MinMaxPriorityQueue)(object4 = this.this$0))) && (n8 = ((Ordering)(object4 = this.ordering)).compare(object3 = this.this$0.elementData(n4), object2)) < 0) {
                n7 = n4;
                object2 = object3;
            }
        }
        if ((n4 = (ordering = this.ordering).compare(object2, object)) < 0) {
            MinMaxPriorityQueue.access$500((MinMaxPriorityQueue)this.this$0)[n3] = object2;
            MinMaxPriorityQueue.access$500((MinMaxPriorityQueue)this.this$0)[n7] = object;
            return n7;
        }
        MinMaxPriorityQueue.access$500((MinMaxPriorityQueue)this.this$0)[n3] = object;
        return n3;
    }

    public int fillHoleAt(int n3) {
        int n4;
        while ((n4 = this.findMinGrandChild(n3)) > 0) {
            Object object;
            Object[] objectArray = MinMaxPriorityQueue.access$500(this.this$0);
            objectArray[n3] = object = this.this$0.elementData(n4);
            n3 = n4;
        }
        return n3;
    }

    public int findMin(int n3, int n4) {
        MinMaxPriorityQueue minMaxPriorityQueue = this.this$0;
        int n7 = MinMaxPriorityQueue.access$600(minMaxPriorityQueue);
        if (n3 >= n7) {
            return -1;
        }
        if (n3 > 0) {
            n7 = 1;
        } else {
            n7 = 0;
            minMaxPriorityQueue = null;
        }
        Preconditions.checkState(n7 != 0);
        minMaxPriorityQueue = this.this$0;
        n7 = MinMaxPriorityQueue.access$600(minMaxPriorityQueue) - n4;
        n7 = Math.min(n3, n7) + n4;
        for (n4 = n3 + 1; n4 < n7; ++n4) {
            int n8 = this.compareElements(n4, n3);
            if (n8 >= 0) continue;
            n3 = n4;
        }
        return n3;
    }

    public int findMinChild(int n3) {
        n3 = this.getLeftChildIndex(n3);
        return this.findMin(n3, 2);
    }

    public int findMinGrandChild(int n3) {
        if ((n3 = this.getLeftChildIndex(n3)) < 0) {
            return -1;
        }
        n3 = this.getLeftChildIndex(n3);
        return this.findMin(n3, 4);
    }

    public int swapWithConceptuallyLastElement(Object objectArray) {
        Object object = this.this$0;
        int n3 = MinMaxPriorityQueue.access$600((MinMaxPriorityQueue)object);
        if ((n3 = this.getParentIndex(n3)) != 0) {
            Object object2;
            int n4;
            int n7 = this.getParentIndex(n3);
            if ((n7 = this.getRightChildIndex(n7)) != n3 && (n3 = this.getLeftChildIndex(n7)) >= (n4 = MinMaxPriorityQueue.access$600((MinMaxPriorityQueue)(object2 = this.this$0))) && (n4 = ((Ordering)(object2 = this.ordering)).compare(object = this.this$0.elementData(n7), objectArray)) < 0) {
                MinMaxPriorityQueue.access$500((MinMaxPriorityQueue)this.this$0)[n7] = objectArray;
                objectArray = MinMaxPriorityQueue.access$500(this.this$0);
                n4 = MinMaxPriorityQueue.access$600(this.this$0);
                objectArray[n4] = object;
                return n7;
            }
        }
        return MinMaxPriorityQueue.access$600(this.this$0);
    }

    public MinMaxPriorityQueue$MoveDesc tryCrossOverAndBubbleUp(int n3, int n4, Object object) {
        Object object2;
        int n7 = this.crossOver(n4, object);
        if (n7 == n4) {
            return null;
        }
        if (n7 < n3) {
            object2 = this.this$0.elementData(n3);
        } else {
            object2 = this.this$0;
            int n8 = this.getParentIndex(n3);
            object2 = ((MinMaxPriorityQueue)object2).elementData(n8);
        }
        MinMaxPriorityQueue$Heap minMaxPriorityQueue$Heap = this.otherHeap;
        n7 = minMaxPriorityQueue$Heap.bubbleUpAlternatingLevels(n7, object);
        if (n7 < n3) {
            MinMaxPriorityQueue$MoveDesc minMaxPriorityQueue$MoveDesc = new MinMaxPriorityQueue$MoveDesc(object, object2);
            return minMaxPriorityQueue$MoveDesc;
        }
        return null;
    }
}

