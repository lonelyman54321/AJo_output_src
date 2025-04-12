/*
 * Decompiled with CFR 0.152.
 */
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from Lu1
 */
public final class lu1_1
extends AbstractCollection
implements Deque {
    public ku1_1 a;
    public ku1_1 b;

    public final void a() {
        boolean bl2 = this.isEmpty();
        if (!bl2) {
            return;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final boolean add(Object object) {
        object = (ku1_1)object;
        return this.d((ku1_1)object);
    }

    public final void addFirst(Object object) {
        boolean bl2 = this.c((ku1_1)(object = (ku1_1)object));
        if (!bl2) {
            ku1_1 ku1_12 = this.a;
            this.a = object;
            if (ku1_12 == null) {
                this.b = object;
            } else {
                ku1_12.c((ku1_1)object);
                object.b(ku1_12);
            }
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public final void addLast(Object object) {
        boolean bl2 = this.d((ku1_1)(object = (ku1_1)object));
        if (bl2) {
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public final boolean c(ku1_1 ku1_12) {
        boolean bl2;
        ku1_1 ku1_13 = ku1_12.a();
        if (ku1_13 == null && (ku1_13 = ku1_12.getNext()) == null && ku1_12 != (ku1_13 = this.a)) {
            bl2 = false;
            ku1_12 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void clear() {
        ku1_1 ku1_12 = this.a;
        while (ku1_12 != null) {
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h = ku1_12.getNext();
            ku1_12.c(null);
            ku1_12.b(null);
            ku1_12 = privateMaxEntriesMap$h;
        }
        this.b = null;
        this.a = null;
    }

    public final boolean contains(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ku1_1;
        if (bl3 && (bl2 = this.c((ku1_1)(object = (ku1_1)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean d(ku1_1 ku1_12) {
        boolean bl2 = this.c(ku1_12);
        if (bl2) {
            return false;
        }
        ku1_1 ku1_13 = this.b;
        this.b = ku1_12;
        if (ku1_13 == null) {
            this.a = ku1_12;
        } else {
            ku1_13.b(ku1_12);
            ku1_12.c(ku1_13);
        }
        return true;
    }

    public final Iterator descendingIterator() {
        ku1_1 ku1_12 = this.b;
        Lu1$b lu1$b = new Lu1$c(ku1_12);
        return lu1$b;
    }

    public final ku1_1 e() {
        boolean bl2 = this.isEmpty();
        ku1_1 ku1_12 = null;
        if (!bl2) {
            ku1_1 ku1_13 = this.a;
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h = ku1_13.getNext();
            ku1_13.b(null);
            this.a = privateMaxEntriesMap$h;
            if (privateMaxEntriesMap$h == null) {
                this.b = null;
            } else {
                privateMaxEntriesMap$h.b = null;
            }
            ku1_12 = ku1_13;
        }
        return ku1_12;
    }

    public final Object element() {
        this.a();
        return this.a;
    }

    public final Object getFirst() {
        this.a();
        return this.a;
    }

    public final Object getLast() {
        this.a();
        return this.b;
    }

    public final boolean isEmpty() {
        boolean bl2;
        ku1_1 ku1_12 = this.a;
        if (ku1_12 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            ku1_12 = null;
        }
        return bl2;
    }

    public final Iterator iterator() {
        ku1_1 ku1_12 = this.a;
        Lu1$a lu1$a = new Lu1$c(ku1_12);
        return lu1$a;
    }

    public final boolean offer(Object object) {
        object = (ku1_1)object;
        return this.d((ku1_1)object);
    }

    public final boolean offerFirst(Object object) {
        boolean bl2;
        boolean bl3 = this.c((ku1_1)(object = (ku1_1)object));
        if (bl3) {
            bl2 = false;
            object = null;
        } else {
            ku1_1 ku1_12 = this.a;
            this.a = object;
            if (ku1_12 == null) {
                this.b = object;
            } else {
                ku1_12.c((ku1_1)object);
                object.b(ku1_12);
            }
            bl2 = true;
        }
        return bl2;
    }

    public final Object peek() {
        return this.a;
    }

    public final Object peekFirst() {
        return this.a;
    }

    public final Object peekLast() {
        return this.b;
    }

    public final Object poll() {
        return this.e();
    }

    public final Object pollLast() {
        boolean bl2 = this.isEmpty();
        ku1_1 ku1_12 = null;
        if (!bl2) {
            ku1_1 ku1_13 = this.b;
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h = ku1_13.a();
            ku1_13.c(null);
            this.b = privateMaxEntriesMap$h;
            if (privateMaxEntriesMap$h == null) {
                this.a = null;
            } else {
                privateMaxEntriesMap$h.c = null;
            }
            ku1_12 = ku1_13;
        }
        return ku1_12;
    }

    public final Object pop() {
        this.a();
        return this.e();
    }

    public final void push(Object object) {
        boolean bl2 = this.c((ku1_1)(object = (ku1_1)object));
        if (!bl2) {
            ku1_1 ku1_12 = this.a;
            this.a = object;
            if (ku1_12 == null) {
                this.b = object;
            } else {
                ku1_12.c((ku1_1)object);
                object.b(ku1_12);
            }
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public final Object remove() {
        this.a();
        return this.e();
    }

    public final boolean remove(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ku1_1;
        if (bl3 && (bl3 = this.c((ku1_1)(object = (ku1_1)object)))) {
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h = object.a();
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h2 = object.getNext();
            if (privateMaxEntriesMap$h == null) {
                this.a = privateMaxEntriesMap$h2;
            } else {
                privateMaxEntriesMap$h.c = privateMaxEntriesMap$h2;
                object.c(null);
            }
            if (privateMaxEntriesMap$h2 == null) {
                this.b = privateMaxEntriesMap$h;
            } else {
                privateMaxEntriesMap$h2.b = privateMaxEntriesMap$h;
                object.b(null);
            }
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean removeAll(Collection object) {
        boolean bl2;
        object = object.iterator();
        boolean bl3 = false;
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = this.remove(e2);
            bl3 |= bl2;
        }
        return bl3;
    }

    public final Object removeFirst() {
        this.a();
        return this.e();
    }

    public final boolean removeFirstOccurrence(Object object) {
        return this.remove(object);
    }

    public final Object removeLast() {
        this.a();
        boolean bl2 = this.isEmpty();
        ku1_1 ku1_12 = null;
        if (!bl2) {
            ku1_1 ku1_13 = this.b;
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h = ku1_13.a();
            ku1_13.c(null);
            this.b = privateMaxEntriesMap$h;
            if (privateMaxEntriesMap$h == null) {
                this.a = null;
            } else {
                privateMaxEntriesMap$h.c = null;
            }
            ku1_12 = ku1_13;
        }
        return ku1_12;
    }

    public final boolean removeLastOccurrence(Object object) {
        return this.remove(object);
    }

    public final int size() {
        int n3 = 0;
        for (ku1_1 ku1_12 = this.a; ku1_12 != null; ku1_12 = ku1_12.getNext()) {
            ++n3;
        }
        return n3;
    }
}

