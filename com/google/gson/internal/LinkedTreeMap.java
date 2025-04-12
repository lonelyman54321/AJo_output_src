/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.LinkedTreeMap$1;
import com.google.gson.internal.LinkedTreeMap$EntrySet;
import com.google.gson.internal.LinkedTreeMap$KeySet;
import com.google.gson.internal.LinkedTreeMap$Node;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class LinkedTreeMap
extends AbstractMap
implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final Comparator NATURAL_ORDER;
    private final boolean allowNullValues;
    private final Comparator comparator;
    private LinkedTreeMap$EntrySet entrySet;
    final LinkedTreeMap$Node header;
    private LinkedTreeMap$KeySet keySet;
    int modCount;
    LinkedTreeMap$Node root;
    int size;

    static {
        LinkedTreeMap$1 linkedTreeMap$1 = new LinkedTreeMap$1();
        NATURAL_ORDER = linkedTreeMap$1;
    }

    public LinkedTreeMap() {
        Comparator comparator = NATURAL_ORDER;
        this(comparator, true);
    }

    public LinkedTreeMap(Comparator object, boolean bl2) {
        this.size = 0;
        this.modCount = 0;
        if (object == null) {
            object = NATURAL_ORDER;
        }
        this.comparator = object;
        this.allowNullValues = bl2;
        this.header = object = new LinkedTreeMap$Node(bl2);
    }

    public LinkedTreeMap(boolean bl2) {
        Comparator comparator = NATURAL_ORDER;
        this(comparator, bl2);
    }

    private boolean equal(Object object, Object object2) {
        return Objects.equals(object, object2);
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Deserialization is unsupported");
        throw object;
    }

    private void rebalance(LinkedTreeMap$Node linkedTreeMap$Node, boolean bl2) {
        while (linkedTreeMap$Node != null) {
            int n3;
            LinkedTreeMap$Node linkedTreeMap$Node2;
            int n4;
            LinkedTreeMap$Node linkedTreeMap$Node3 = linkedTreeMap$Node.left;
            LinkedTreeMap$Node linkedTreeMap$Node4 = linkedTreeMap$Node.right;
            int n7 = 0;
            if (linkedTreeMap$Node3 != null) {
                n4 = linkedTreeMap$Node3.height;
            } else {
                n4 = 0;
                linkedTreeMap$Node2 = null;
            }
            int n8 = linkedTreeMap$Node4 != null ? linkedTreeMap$Node4.height : 0;
            int n10 = n4 - n8;
            int n14 = -2;
            if (n10 == n14) {
                linkedTreeMap$Node3 = linkedTreeMap$Node4.left;
                linkedTreeMap$Node2 = linkedTreeMap$Node4.right;
                if (linkedTreeMap$Node2 != null) {
                    n4 = linkedTreeMap$Node2.height;
                } else {
                    n4 = 0;
                    linkedTreeMap$Node2 = null;
                }
                if (linkedTreeMap$Node3 != null) {
                    n7 = linkedTreeMap$Node3.height;
                }
                if ((n7 -= n4) != (n3 = -1) && (n7 != 0 || bl2)) {
                    this.rotateRight(linkedTreeMap$Node4);
                    this.rotateLeft(linkedTreeMap$Node);
                } else {
                    this.rotateLeft(linkedTreeMap$Node);
                }
                if (bl2) {
                    break;
                }
            } else {
                int n15 = 2;
                n14 = 1;
                if (n10 == n15) {
                    linkedTreeMap$Node4 = linkedTreeMap$Node3.left;
                    linkedTreeMap$Node2 = linkedTreeMap$Node3.right;
                    if (linkedTreeMap$Node2 != null) {
                        n4 = linkedTreeMap$Node2.height;
                    } else {
                        n4 = 0;
                        linkedTreeMap$Node2 = null;
                    }
                    if (linkedTreeMap$Node4 != null) {
                        n7 = linkedTreeMap$Node4.height;
                    }
                    if ((n7 -= n4) != n14 && (n7 != 0 || bl2)) {
                        this.rotateLeft(linkedTreeMap$Node3);
                        this.rotateRight(linkedTreeMap$Node);
                    } else {
                        this.rotateRight(linkedTreeMap$Node);
                    }
                    if (bl2) {
                        break;
                    }
                } else if (n10 == 0) {
                    linkedTreeMap$Node.height = ++n4;
                    if (bl2) {
                        break;
                    }
                } else {
                    linkedTreeMap$Node.height = n3 = Math.max(n4, n8) + n14;
                    if (!bl2) break;
                }
            }
            linkedTreeMap$Node = linkedTreeMap$Node.parent;
        }
    }

    private void replaceInParent(LinkedTreeMap$Node linkedTreeMap$Node, LinkedTreeMap$Node linkedTreeMap$Node2) {
        LinkedTreeMap$Node linkedTreeMap$Node3 = linkedTreeMap$Node.parent;
        LinkedTreeMap$Node linkedTreeMap$Node4 = null;
        linkedTreeMap$Node.parent = null;
        if (linkedTreeMap$Node2 != null) {
            linkedTreeMap$Node2.parent = linkedTreeMap$Node3;
        }
        if (linkedTreeMap$Node3 != null) {
            linkedTreeMap$Node4 = linkedTreeMap$Node3.left;
            if (linkedTreeMap$Node4 == linkedTreeMap$Node) {
                linkedTreeMap$Node3.left = linkedTreeMap$Node2;
            } else {
                linkedTreeMap$Node3.right = linkedTreeMap$Node2;
            }
        } else {
            this.root = linkedTreeMap$Node2;
        }
    }

    private void rotateLeft(LinkedTreeMap$Node linkedTreeMap$Node) {
        int n3;
        int n4;
        int n7;
        LinkedTreeMap$Node linkedTreeMap$Node2 = linkedTreeMap$Node.left;
        LinkedTreeMap$Node linkedTreeMap$Node3 = linkedTreeMap$Node.right;
        LinkedTreeMap$Node linkedTreeMap$Node4 = linkedTreeMap$Node3.left;
        LinkedTreeMap$Node linkedTreeMap$Node5 = linkedTreeMap$Node3.right;
        linkedTreeMap$Node.right = linkedTreeMap$Node4;
        if (linkedTreeMap$Node4 != null) {
            linkedTreeMap$Node4.parent = linkedTreeMap$Node;
        }
        this.replaceInParent(linkedTreeMap$Node, linkedTreeMap$Node3);
        linkedTreeMap$Node3.left = linkedTreeMap$Node;
        linkedTreeMap$Node.parent = linkedTreeMap$Node3;
        int n8 = 0;
        if (linkedTreeMap$Node2 != null) {
            n7 = linkedTreeMap$Node2.height;
        } else {
            n7 = 0;
            linkedTreeMap$Node2 = null;
        }
        if (linkedTreeMap$Node4 != null) {
            n4 = linkedTreeMap$Node4.height;
        } else {
            n4 = 0;
            linkedTreeMap$Node4 = null;
        }
        linkedTreeMap$Node.height = n7 = Math.max(n7, n4) + 1;
        if (linkedTreeMap$Node5 != null) {
            n8 = linkedTreeMap$Node5.height;
        }
        linkedTreeMap$Node3.height = n3 = Math.max(n7, n8) + 1;
    }

    private void rotateRight(LinkedTreeMap$Node linkedTreeMap$Node) {
        int n3;
        int n4;
        int n7;
        LinkedTreeMap$Node linkedTreeMap$Node2;
        LinkedTreeMap$Node linkedTreeMap$Node3 = linkedTreeMap$Node.left;
        LinkedTreeMap$Node linkedTreeMap$Node4 = linkedTreeMap$Node.right;
        LinkedTreeMap$Node linkedTreeMap$Node5 = linkedTreeMap$Node3.left;
        linkedTreeMap$Node.left = linkedTreeMap$Node2 = linkedTreeMap$Node3.right;
        if (linkedTreeMap$Node2 != null) {
            linkedTreeMap$Node2.parent = linkedTreeMap$Node;
        }
        this.replaceInParent(linkedTreeMap$Node, linkedTreeMap$Node3);
        linkedTreeMap$Node3.right = linkedTreeMap$Node;
        linkedTreeMap$Node.parent = linkedTreeMap$Node3;
        int n8 = 0;
        if (linkedTreeMap$Node4 != null) {
            n7 = linkedTreeMap$Node4.height;
        } else {
            n7 = 0;
            linkedTreeMap$Node4 = null;
        }
        if (linkedTreeMap$Node2 != null) {
            n4 = linkedTreeMap$Node2.height;
        } else {
            n4 = 0;
            linkedTreeMap$Node2 = null;
        }
        linkedTreeMap$Node.height = n7 = Math.max(n7, n4) + 1;
        if (linkedTreeMap$Node5 != null) {
            n8 = linkedTreeMap$Node5.height;
        }
        linkedTreeMap$Node3.height = n3 = Math.max(n7, n8) + 1;
    }

    private Object writeReplace() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this);
        return linkedHashMap;
    }

    public void clear() {
        LinkedTreeMap$Node linkedTreeMap$Node;
        int n3;
        this.root = null;
        this.size = 0;
        this.modCount = n3 = this.modCount + 1;
        linkedTreeMap$Node.prev = linkedTreeMap$Node = this.header;
        linkedTreeMap$Node.next = linkedTreeMap$Node;
    }

    public boolean containsKey(Object object) {
        boolean bl2;
        if ((object = this.findByObject(object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Set entrySet() {
        LinkedTreeMap$EntrySet linkedTreeMap$EntrySet = this.entrySet;
        if (linkedTreeMap$EntrySet == null) {
            this.entrySet = linkedTreeMap$EntrySet = new LinkedTreeMap$EntrySet(this);
        }
        return linkedTreeMap$EntrySet;
    }

    public LinkedTreeMap$Node find(Object object, boolean bl2) {
        int n3;
        Object object2;
        int n4;
        Object object3 = this.comparator;
        Object object4 = this.root;
        Comparator comparator = null;
        if (object4 != null) {
            Object object5 = NATURAL_ORDER;
            if (object3 == object5) {
                object5 = object;
                object5 = (Comparable)object;
            } else {
                object5 = null;
            }
            while (true) {
                Object object6;
                if (object5 != null) {
                    object6 = ((LinkedTreeMap$Node)object4).key;
                    n4 = object5.compareTo(object6);
                } else {
                    object6 = ((LinkedTreeMap$Node)object4).key;
                    n4 = object3.compare(object, object6);
                }
                if (n4 == 0) {
                    return object4;
                }
                object2 = n4 < 0 ? ((LinkedTreeMap$Node)object4).left : ((LinkedTreeMap$Node)object4).right;
                if (object2 != null) {
                    object4 = object2;
                    continue;
                }
                break;
            }
        } else {
            n4 = 0;
            Object var7_8 = null;
        }
        if (!bl2) {
            return null;
        }
        LinkedTreeMap$Node linkedTreeMap$Node = this.header;
        bl2 = true;
        if (object4 == null) {
            boolean bl3;
            comparator = NATURAL_ORDER;
            if (object3 == comparator && !(bl3 = object instanceof Comparable)) {
                object = object.getClass().getName().concat(" is not Comparable");
                ClassCastException classCastException = new ClassCastException((String)object);
                throw classCastException;
            }
            boolean bl4 = this.allowNullValues;
            LinkedTreeMap$Node linkedTreeMap$Node2 = linkedTreeMap$Node.prev;
            object2 = object3;
            this.root = object3 = new LinkedTreeMap$Node(bl4, (LinkedTreeMap$Node)object4, object, linkedTreeMap$Node, linkedTreeMap$Node2);
        } else {
            boolean bl5 = this.allowNullValues;
            LinkedTreeMap$Node linkedTreeMap$Node3 = linkedTreeMap$Node.prev;
            object2 = object3;
            object3 = new LinkedTreeMap$Node(bl5, (LinkedTreeMap$Node)object4, object, linkedTreeMap$Node, linkedTreeMap$Node3);
            if (n4 < 0) {
                ((LinkedTreeMap$Node)object4).left = object3;
            } else {
                ((LinkedTreeMap$Node)object4).right = object3;
            }
            this.rebalance((LinkedTreeMap$Node)object4, bl2);
        }
        this.size = n3 = this.size + bl2;
        this.modCount = n3 = this.modCount + bl2;
        return object3;
    }

    public LinkedTreeMap$Node findByEntry(Map.Entry entry) {
        Object object;
        boolean bl2;
        Object object2 = entry.getKey();
        if ((object2 = this.findByObject(object2)) == null || !(bl2 = this.equal(object = ((LinkedTreeMap$Node)object2).value, entry = entry.getValue()))) {
            object2 = null;
        }
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public LinkedTreeMap$Node findByObject(Object object) {
        LinkedTreeMap$Node linkedTreeMap$Node = null;
        if (object == null) return linkedTreeMap$Node;
        try {
            return this.find(object, false);
        }
        catch (ClassCastException classCastException) {
            return linkedTreeMap$Node;
        }
    }

    public Object get(Object object) {
        object = (object = this.findByObject(object)) != null ? ((LinkedTreeMap$Node)object).value : null;
        return object;
    }

    public Set keySet() {
        LinkedTreeMap$KeySet linkedTreeMap$KeySet = this.keySet;
        if (linkedTreeMap$KeySet == null) {
            this.keySet = linkedTreeMap$KeySet = new LinkedTreeMap$KeySet(this);
        }
        return linkedTreeMap$KeySet;
    }

    public Object put(Object object, Object object2) {
        if (object != null) {
            boolean bl2;
            if (object2 == null && !(bl2 = this.allowNullValues)) {
                object = new NullPointerException("value == null");
                throw object;
            }
            object = this.find(object, true);
            Object object3 = ((LinkedTreeMap$Node)object).value;
            ((LinkedTreeMap$Node)object).value = object2;
            return object3;
        }
        object = new NullPointerException("key == null");
        throw object;
    }

    public Object remove(Object object) {
        object = (object = this.removeInternalByKey(object)) != null ? ((LinkedTreeMap$Node)object).value : null;
        return object;
    }

    public void removeInternal(LinkedTreeMap$Node linkedTreeMap$Node, boolean bl2) {
        int n3;
        LinkedTreeMap$Node linkedTreeMap$Node2;
        LinkedTreeMap$Node linkedTreeMap$Node3;
        if (bl2) {
            linkedTreeMap$Node3 = linkedTreeMap$Node.prev;
            linkedTreeMap$Node3.next = linkedTreeMap$Node2 = linkedTreeMap$Node.next;
            linkedTreeMap$Node2 = linkedTreeMap$Node.next;
            linkedTreeMap$Node2.prev = linkedTreeMap$Node3;
        }
        linkedTreeMap$Node3 = linkedTreeMap$Node.left;
        linkedTreeMap$Node2 = linkedTreeMap$Node.right;
        LinkedTreeMap$Node linkedTreeMap$Node4 = linkedTreeMap$Node.parent;
        int n4 = 0;
        if (linkedTreeMap$Node3 != null && linkedTreeMap$Node2 != null) {
            int n7;
            int n8 = linkedTreeMap$Node3.height;
            int n10 = linkedTreeMap$Node2.height;
            linkedTreeMap$Node3 = n8 > n10 ? linkedTreeMap$Node3.last() : linkedTreeMap$Node2.first();
            this.removeInternal(linkedTreeMap$Node3, false);
            linkedTreeMap$Node2 = linkedTreeMap$Node.left;
            if (linkedTreeMap$Node2 != null) {
                n8 = linkedTreeMap$Node2.height;
                linkedTreeMap$Node3.left = linkedTreeMap$Node2;
                linkedTreeMap$Node2.parent = linkedTreeMap$Node3;
                linkedTreeMap$Node.left = null;
            } else {
                n8 = 0;
                linkedTreeMap$Node4 = null;
            }
            linkedTreeMap$Node2 = linkedTreeMap$Node.right;
            if (linkedTreeMap$Node2 != null) {
                n4 = linkedTreeMap$Node2.height;
                linkedTreeMap$Node3.right = linkedTreeMap$Node2;
                linkedTreeMap$Node2.parent = linkedTreeMap$Node3;
                linkedTreeMap$Node.right = null;
            }
            linkedTreeMap$Node3.height = n7 = Math.max(n8, n4) + 1;
            this.replaceInParent(linkedTreeMap$Node, linkedTreeMap$Node3);
            return;
        }
        if (linkedTreeMap$Node3 != null) {
            this.replaceInParent(linkedTreeMap$Node, linkedTreeMap$Node3);
            linkedTreeMap$Node.left = null;
        } else if (linkedTreeMap$Node2 != null) {
            this.replaceInParent(linkedTreeMap$Node, linkedTreeMap$Node2);
            linkedTreeMap$Node.right = null;
        } else {
            this.replaceInParent(linkedTreeMap$Node, null);
        }
        this.rebalance(linkedTreeMap$Node4, false);
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
    }

    public LinkedTreeMap$Node removeInternalByKey(Object object) {
        if ((object = this.findByObject(object)) != null) {
            boolean bl2 = true;
            this.removeInternal((LinkedTreeMap$Node)object, bl2);
        }
        return object;
    }

    public int size() {
        return this.size;
    }
}

