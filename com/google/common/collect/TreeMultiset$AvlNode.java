/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multisets;
import com.google.common.collect.NullnessCasts;
import com.google.common.collect.TreeMultiset;
import java.util.Comparator;
import java.util.Objects;

final class TreeMultiset$AvlNode {
    private int distinctElements;
    private final Object elem;
    private int elemCount;
    private int height;
    private TreeMultiset$AvlNode left;
    private TreeMultiset$AvlNode pred;
    private TreeMultiset$AvlNode right;
    private TreeMultiset$AvlNode succ;
    private long totalCount;

    public TreeMultiset$AvlNode() {
        this.elem = null;
        this.elemCount = 1;
    }

    public TreeMultiset$AvlNode(Object object, int n3) {
        long l2;
        int n4 = 1;
        boolean bl2 = n3 > 0;
        Preconditions.checkArgument(bl2);
        this.elem = object;
        this.elemCount = n3;
        this.totalCount = l2 = (long)n3;
        this.distinctElements = n4;
        this.height = n4;
        this.left = null;
        this.right = null;
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$1000(TreeMultiset$AvlNode treeMultiset$AvlNode, Comparator comparator, Object object) {
        return treeMultiset$AvlNode.ceiling(comparator, object);
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$1100(TreeMultiset$AvlNode treeMultiset$AvlNode, Comparator comparator, Object object) {
        return treeMultiset$AvlNode.floor(comparator, object);
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$1200(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return treeMultiset$AvlNode.pred();
    }

    public static /* synthetic */ int access$200(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return treeMultiset$AvlNode.elemCount;
    }

    public static /* synthetic */ int access$202(TreeMultiset$AvlNode treeMultiset$AvlNode, int n3) {
        treeMultiset$AvlNode.elemCount = n3;
        return n3;
    }

    public static /* synthetic */ long access$300(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return treeMultiset$AvlNode.totalCount;
    }

    public static /* synthetic */ int access$400(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return treeMultiset$AvlNode.distinctElements;
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$500(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return treeMultiset$AvlNode.left;
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$502(TreeMultiset$AvlNode treeMultiset$AvlNode, TreeMultiset$AvlNode treeMultiset$AvlNode2) {
        treeMultiset$AvlNode.left = treeMultiset$AvlNode2;
        return treeMultiset$AvlNode2;
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$600(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return treeMultiset$AvlNode.right;
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$602(TreeMultiset$AvlNode treeMultiset$AvlNode, TreeMultiset$AvlNode treeMultiset$AvlNode2) {
        treeMultiset$AvlNode.right = treeMultiset$AvlNode2;
        return treeMultiset$AvlNode2;
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$700(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return treeMultiset$AvlNode.succ();
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$802(TreeMultiset$AvlNode treeMultiset$AvlNode, TreeMultiset$AvlNode treeMultiset$AvlNode2) {
        treeMultiset$AvlNode.pred = treeMultiset$AvlNode2;
        return treeMultiset$AvlNode2;
    }

    public static /* synthetic */ TreeMultiset$AvlNode access$902(TreeMultiset$AvlNode treeMultiset$AvlNode, TreeMultiset$AvlNode treeMultiset$AvlNode2) {
        treeMultiset$AvlNode.succ = treeMultiset$AvlNode2;
        return treeMultiset$AvlNode2;
    }

    private TreeMultiset$AvlNode addLeftChild(Object object, int n3) {
        int n4;
        TreeMultiset$AvlNode treeMultiset$AvlNode;
        this.left = treeMultiset$AvlNode = new TreeMultiset$AvlNode(object, n3);
        object = this.pred();
        treeMultiset$AvlNode = this.left;
        TreeMultiset.access$1800((TreeMultiset$AvlNode)object, treeMultiset$AvlNode, this);
        int n7 = this.height;
        this.height = n4 = Math.max(2, n7);
        this.distinctElements = n4 = this.distinctElements + 1;
        long l2 = this.totalCount;
        long l3 = n3;
        this.totalCount = l2 += l3;
        return this;
    }

    private TreeMultiset$AvlNode addRightChild(Object object, int n3) {
        int n4;
        TreeMultiset$AvlNode treeMultiset$AvlNode;
        this.right = treeMultiset$AvlNode = new TreeMultiset$AvlNode(object, n3);
        object = this.succ();
        TreeMultiset.access$1800(this, treeMultiset$AvlNode, (TreeMultiset$AvlNode)object);
        int n7 = this.height;
        this.height = n4 = Math.max(2, n7);
        this.distinctElements = n4 = this.distinctElements + 1;
        long l2 = this.totalCount;
        long l3 = n3;
        this.totalCount = l2 += l3;
        return this;
    }

    private int balanceFactor() {
        int n3 = TreeMultiset$AvlNode.height(this.left);
        int n4 = TreeMultiset$AvlNode.height(this.right);
        return n3 - n4;
    }

    private TreeMultiset$AvlNode ceiling(Comparator object, Object object2) {
        Object object3 = this.getElement();
        int n3 = object.compare(object2, object3);
        if (n3 < 0) {
            object3 = this.left;
            object = object3 == null ? this : (TreeMultiset$AvlNode)MoreObjects.firstNonNull(super.ceiling((Comparator)object, object2), this);
            return object;
        }
        if (n3 == 0) {
            return this;
        }
        object3 = this.right;
        object = object3 == null ? null : super.ceiling((Comparator)object, object2);
        return object;
    }

    private TreeMultiset$AvlNode deleteMe() {
        int n3 = this.elemCount;
        int n4 = 0;
        this.elemCount = 0;
        TreeMultiset$AvlNode treeMultiset$AvlNode = this.pred();
        TreeMultiset$AvlNode treeMultiset$AvlNode2 = this.succ();
        TreeMultiset.access$1900(treeMultiset$AvlNode, treeMultiset$AvlNode2);
        treeMultiset$AvlNode = this.left;
        if (treeMultiset$AvlNode == null) {
            return this.right;
        }
        treeMultiset$AvlNode2 = this.right;
        if (treeMultiset$AvlNode2 == null) {
            return treeMultiset$AvlNode;
        }
        n4 = treeMultiset$AvlNode.height;
        int n7 = treeMultiset$AvlNode2.height;
        if (n4 >= n7) {
            treeMultiset$AvlNode = this.pred();
            treeMultiset$AvlNode.left = treeMultiset$AvlNode2 = this.left.removeMax(treeMultiset$AvlNode);
            treeMultiset$AvlNode.right = treeMultiset$AvlNode2 = this.right;
            treeMultiset$AvlNode.distinctElements = n7 = this.distinctElements + -1;
            long l2 = this.totalCount;
            long l3 = n3;
            treeMultiset$AvlNode.totalCount = l2 -= l3;
            return treeMultiset$AvlNode.rebalance();
        }
        treeMultiset$AvlNode = this.succ();
        treeMultiset$AvlNode.right = treeMultiset$AvlNode2 = this.right.removeMin(treeMultiset$AvlNode);
        treeMultiset$AvlNode.left = treeMultiset$AvlNode2 = this.left;
        treeMultiset$AvlNode.distinctElements = n7 = this.distinctElements + -1;
        long l4 = this.totalCount;
        long l7 = n3;
        treeMultiset$AvlNode.totalCount = l4 -= l7;
        return treeMultiset$AvlNode.rebalance();
    }

    private TreeMultiset$AvlNode floor(Comparator object, Object object2) {
        Object object3 = this.getElement();
        int n3 = object.compare(object2, object3);
        if (n3 > 0) {
            object3 = this.right;
            object = object3 == null ? this : (TreeMultiset$AvlNode)MoreObjects.firstNonNull(super.floor((Comparator)object, object2), this);
            return object;
        }
        if (n3 == 0) {
            return this;
        }
        object3 = this.left;
        object = object3 == null ? null : super.floor((Comparator)object, object2);
        return object;
    }

    private static int height(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        int n3;
        if (treeMultiset$AvlNode == null) {
            n3 = 0;
            treeMultiset$AvlNode = null;
        } else {
            n3 = treeMultiset$AvlNode.height;
        }
        return n3;
    }

    private TreeMultiset$AvlNode pred() {
        TreeMultiset$AvlNode treeMultiset$AvlNode = this.pred;
        Objects.requireNonNull(treeMultiset$AvlNode);
        return treeMultiset$AvlNode;
    }

    private TreeMultiset$AvlNode rebalance() {
        int n3;
        int n4 = this.balanceFactor();
        if (n4 != (n3 = -2)) {
            n3 = 2;
            if (n4 != n3) {
                this.recomputeHeight();
                return this;
            }
            Objects.requireNonNull(this.left);
            TreeMultiset$AvlNode treeMultiset$AvlNode = this.left;
            n4 = treeMultiset$AvlNode.balanceFactor();
            if (n4 < 0) {
                this.left = treeMultiset$AvlNode = this.left.rotateLeft();
            }
            return this.rotateRight();
        }
        Objects.requireNonNull(this.right);
        TreeMultiset$AvlNode treeMultiset$AvlNode = this.right;
        n4 = treeMultiset$AvlNode.balanceFactor();
        if (n4 > 0) {
            this.right = treeMultiset$AvlNode = this.right.rotateRight();
        }
        return this.rotateLeft();
    }

    private void recompute() {
        this.recomputeMultiset();
        this.recomputeHeight();
    }

    private void recomputeHeight() {
        int n3 = TreeMultiset$AvlNode.height(this.left);
        int n4 = TreeMultiset$AvlNode.height(this.right);
        this.height = n3 = Math.max(n3, n4) + 1;
    }

    private void recomputeMultiset() {
        int n3;
        int n4 = TreeMultiset.distinctElements(this.left) + 1;
        this.distinctElements = n3 = TreeMultiset.distinctElements(this.right) + n4;
        long l2 = this.elemCount;
        long l3 = TreeMultiset$AvlNode.totalCount(this.left);
        l2 += l3;
        l3 = TreeMultiset$AvlNode.totalCount(this.right);
        this.totalCount = l2 += l3;
    }

    private TreeMultiset$AvlNode removeMax(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        int n3;
        TreeMultiset$AvlNode treeMultiset$AvlNode2 = this.right;
        if (treeMultiset$AvlNode2 == null) {
            return this.left;
        }
        this.right = treeMultiset$AvlNode2 = treeMultiset$AvlNode2.removeMax(treeMultiset$AvlNode);
        this.distinctElements = n3 = this.distinctElements + -1;
        long l2 = this.totalCount;
        long l3 = treeMultiset$AvlNode.elemCount;
        this.totalCount = l2 -= l3;
        return this.rebalance();
    }

    private TreeMultiset$AvlNode removeMin(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        int n3;
        TreeMultiset$AvlNode treeMultiset$AvlNode2 = this.left;
        if (treeMultiset$AvlNode2 == null) {
            return this.right;
        }
        this.left = treeMultiset$AvlNode2 = treeMultiset$AvlNode2.removeMin(treeMultiset$AvlNode);
        this.distinctElements = n3 = this.distinctElements + -1;
        long l2 = this.totalCount;
        long l3 = treeMultiset$AvlNode.elemCount;
        this.totalCount = l2 -= l3;
        return this.rebalance();
    }

    private TreeMultiset$AvlNode rotateLeft() {
        int n3;
        long l2;
        TreeMultiset$AvlNode treeMultiset$AvlNode;
        boolean bl2;
        TreeMultiset$AvlNode treeMultiset$AvlNode2 = this.right;
        if (treeMultiset$AvlNode2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            treeMultiset$AvlNode2 = null;
        }
        Preconditions.checkState(bl2);
        treeMultiset$AvlNode2 = this.right;
        this.right = treeMultiset$AvlNode = treeMultiset$AvlNode2.left;
        treeMultiset$AvlNode2.left = this;
        treeMultiset$AvlNode2.totalCount = l2 = this.totalCount;
        treeMultiset$AvlNode2.distinctElements = n3 = this.distinctElements;
        this.recompute();
        treeMultiset$AvlNode2.recomputeHeight();
        return treeMultiset$AvlNode2;
    }

    private TreeMultiset$AvlNode rotateRight() {
        int n3;
        long l2;
        TreeMultiset$AvlNode treeMultiset$AvlNode;
        boolean bl2;
        TreeMultiset$AvlNode treeMultiset$AvlNode2 = this.left;
        if (treeMultiset$AvlNode2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            treeMultiset$AvlNode2 = null;
        }
        Preconditions.checkState(bl2);
        treeMultiset$AvlNode2 = this.left;
        this.left = treeMultiset$AvlNode = treeMultiset$AvlNode2.right;
        treeMultiset$AvlNode2.right = this;
        treeMultiset$AvlNode2.totalCount = l2 = this.totalCount;
        treeMultiset$AvlNode2.distinctElements = n3 = this.distinctElements;
        this.recompute();
        treeMultiset$AvlNode2.recomputeHeight();
        return treeMultiset$AvlNode2;
    }

    private TreeMultiset$AvlNode succ() {
        TreeMultiset$AvlNode treeMultiset$AvlNode = this.succ;
        Objects.requireNonNull(treeMultiset$AvlNode);
        return treeMultiset$AvlNode;
    }

    private static long totalCount(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        long l2 = treeMultiset$AvlNode == null ? 0L : treeMultiset$AvlNode.totalCount;
        return l2;
    }

    public TreeMultiset$AvlNode add(Comparator object, Object object2, int n3, int[] nArray) {
        int n4;
        Object object3 = this.getElement();
        int n7 = object.compare(object2, object3);
        int n8 = 1;
        if (n7 < 0) {
            object3 = this.left;
            if (object3 == null) {
                nArray[0] = 0;
                return this.addLeftChild(object2, n3);
            }
            int n10 = ((TreeMultiset$AvlNode)object3).height;
            this.left = object = ((TreeMultiset$AvlNode)object3).add((Comparator)object, object2, n3, nArray);
            int n14 = nArray[0];
            if (n14 == 0) {
                this.distinctElements = n14 = this.distinctElements + n8;
            }
            long l2 = this.totalCount;
            long l3 = n3;
            this.totalCount = l2 += l3;
            int n15 = ((TreeMultiset$AvlNode)object).height;
            object = n15 == n10 ? this : this.rebalance();
            return object;
        }
        if (n7 > 0) {
            object3 = this.right;
            if (object3 == null) {
                nArray[0] = 0;
                return this.addRightChild(object2, n3);
            }
            int n16 = ((TreeMultiset$AvlNode)object3).height;
            this.right = object = ((TreeMultiset$AvlNode)object3).add((Comparator)object, object2, n3, nArray);
            int n17 = nArray[0];
            if (n17 == 0) {
                this.distinctElements = n17 = this.distinctElements + n8;
            }
            long l4 = this.totalCount;
            long l7 = n3;
            this.totalCount = l4 += l7;
            int n18 = ((TreeMultiset$AvlNode)object).height;
            object = n18 == n16 ? this : this.rebalance();
            return object;
        }
        nArray[0] = n4 = this.elemCount;
        long l8 = n4;
        long l12 = n3;
        long l14 = Integer.MAX_VALUE;
        long l15 = (l8 += l12) - l14;
        Object object4 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object4 > 0) {
            n8 = 0;
        }
        Preconditions.checkArgument(n8 != 0);
        this.elemCount = n4 = this.elemCount + n3;
        this.totalCount = l8 = this.totalCount + l12;
        return this;
    }

    public int count(Comparator comparator, Object object) {
        Object object2 = this.getElement();
        int n3 = comparator.compare(object, object2);
        int n4 = 0;
        if (n3 < 0) {
            object2 = this.left;
            if (object2 != null) {
                n4 = ((TreeMultiset$AvlNode)object2).count(comparator, object);
            }
            return n4;
        }
        if (n3 > 0) {
            object2 = this.right;
            if (object2 != null) {
                n4 = ((TreeMultiset$AvlNode)object2).count(comparator, object);
            }
            return n4;
        }
        return this.elemCount;
    }

    public int getCount() {
        return this.elemCount;
    }

    public Object getElement() {
        return NullnessCasts.uncheckedCastNullableTToT(this.elem);
    }

    public TreeMultiset$AvlNode remove(Comparator object, Object object2, int n3, int[] nArray) {
        int n4;
        Object object3 = this.getElement();
        int n7 = object.compare(object2, object3);
        if (n7 < 0) {
            object3 = this.left;
            if (object3 == null) {
                nArray[0] = 0;
                return this;
            }
            this.left = object = ((TreeMultiset$AvlNode)object3).remove((Comparator)object, object2, n3, nArray);
            int n8 = nArray[0];
            if (n8 > 0) {
                if (n3 >= n8) {
                    int n10;
                    this.distinctElements = n10 = this.distinctElements + -1;
                    long l2 = this.totalCount;
                    long l3 = n8;
                    this.totalCount = l2 -= l3;
                } else {
                    long l4 = this.totalCount;
                    long l7 = n3;
                    this.totalCount = l4 -= l7;
                }
            }
            object = n8 == 0 ? this : this.rebalance();
            return object;
        }
        if (n7 > 0) {
            object3 = this.right;
            if (object3 == null) {
                nArray[0] = 0;
                return this;
            }
            this.right = object = ((TreeMultiset$AvlNode)object3).remove((Comparator)object, object2, n3, nArray);
            int n14 = nArray[0];
            if (n14 > 0) {
                if (n3 >= n14) {
                    int n15;
                    this.distinctElements = n15 = this.distinctElements + -1;
                    long l8 = this.totalCount;
                    long l12 = n14;
                    this.totalCount = l8 -= l12;
                } else {
                    long l14 = this.totalCount;
                    long l15 = n3;
                    this.totalCount = l14 -= l15;
                }
            }
            return this.rebalance();
        }
        nArray[0] = n4 = this.elemCount;
        if (n3 >= n4) {
            return this.deleteMe();
        }
        this.elemCount = n4 -= n3;
        long l16 = this.totalCount;
        long l17 = n3;
        this.totalCount = l16 -= l17;
        return this;
    }

    public TreeMultiset$AvlNode setCount(Comparator object, Object object2, int n3, int n4, int[] nArray) {
        int n7;
        Object object3 = this.getElement();
        int n8 = object.compare(object2, object3);
        if (n8 < 0) {
            TreeMultiset$AvlNode treeMultiset$AvlNode = this.left;
            if (treeMultiset$AvlNode == null) {
                nArray[0] = 0;
                if (n3 == 0 && n4 > 0) {
                    return this.addLeftChild(object2, n4);
                }
                return this;
            }
            this.left = object = treeMultiset$AvlNode.setCount((Comparator)object, object2, n3, n4, nArray);
            int n10 = nArray[0];
            if (n10 == n3) {
                if (n4 == 0 && n10 != 0) {
                    int n14;
                    this.distinctElements = n14 = this.distinctElements + -1;
                } else if (n4 > 0 && n10 == 0) {
                    int n15;
                    this.distinctElements = n15 = this.distinctElements + 1;
                }
                long l2 = this.totalCount;
                long l3 = n4 -= n10;
                this.totalCount = l2 += l3;
            }
            return this.rebalance();
        }
        if (n8 > 0) {
            TreeMultiset$AvlNode treeMultiset$AvlNode = this.right;
            if (treeMultiset$AvlNode == null) {
                nArray[0] = 0;
                if (n3 == 0 && n4 > 0) {
                    return this.addRightChild(object2, n4);
                }
                return this;
            }
            this.right = object = treeMultiset$AvlNode.setCount((Comparator)object, object2, n3, n4, nArray);
            int n16 = nArray[0];
            if (n16 == n3) {
                if (n4 == 0 && n16 != 0) {
                    int n17;
                    this.distinctElements = n17 = this.distinctElements + -1;
                } else if (n4 > 0 && n16 == 0) {
                    int n18;
                    this.distinctElements = n18 = this.distinctElements + 1;
                }
                long l4 = this.totalCount;
                long l7 = n4 -= n16;
                this.totalCount = l4 += l7;
            }
            return this.rebalance();
        }
        nArray[0] = n7 = this.elemCount;
        if (n3 == n7) {
            if (n4 == 0) {
                return this.deleteMe();
            }
            long l8 = this.totalCount;
            n7 = n4 - n7;
            long l12 = n7;
            this.totalCount = l8 += l12;
            this.elemCount = n4;
        }
        return this;
    }

    public TreeMultiset$AvlNode setCount(Comparator object, Object object2, int n3, int[] nArray) {
        int n4;
        Object object3 = this.getElement();
        int n7 = object.compare(object2, object3);
        if (n7 < 0) {
            int n8;
            object3 = this.left;
            if (object3 == null) {
                nArray[0] = 0;
                object = n3 > 0 ? this.addLeftChild(object2, n3) : this;
                return object;
            }
            this.left = object = ((TreeMultiset$AvlNode)object3).setCount((Comparator)object, object2, n3, nArray);
            if (n3 == 0 && (n8 = nArray[0]) != 0) {
                this.distinctElements = n8 = this.distinctElements + -1;
            } else if (n3 > 0 && (n8 = nArray[0]) == 0) {
                this.distinctElements = n8 = this.distinctElements + 1;
            }
            long l2 = this.totalCount;
            int n10 = nArray[0];
            long l3 = n3 - n10;
            this.totalCount = l2 += l3;
            return this.rebalance();
        }
        if (n7 > 0) {
            int n14;
            object3 = this.right;
            if (object3 == null) {
                nArray[0] = 0;
                object = n3 > 0 ? this.addRightChild(object2, n3) : this;
                return object;
            }
            this.right = object = ((TreeMultiset$AvlNode)object3).setCount((Comparator)object, object2, n3, nArray);
            if (n3 == 0 && (n14 = nArray[0]) != 0) {
                this.distinctElements = n14 = this.distinctElements + -1;
            } else if (n3 > 0 && (n14 = nArray[0]) == 0) {
                this.distinctElements = n14 = this.distinctElements + 1;
            }
            long l4 = this.totalCount;
            int n15 = nArray[0];
            long l7 = n3 - n15;
            this.totalCount = l4 += l7;
            return this.rebalance();
        }
        nArray[0] = n4 = this.elemCount;
        if (n3 == 0) {
            return this.deleteMe();
        }
        long l8 = this.totalCount;
        long l12 = n3 - n4;
        this.totalCount = l8 += l12;
        this.elemCount = n3;
        return this;
    }

    public String toString() {
        Object object = this.getElement();
        int n3 = this.getCount();
        return Multisets.immutableEntry(object, n3).toString();
    }
}

