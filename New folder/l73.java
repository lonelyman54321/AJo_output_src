/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class l73
implements C30,
Iterable,
KMappedMarker {
    public int[] a;
    public int b;
    public Object[] c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public ArrayList h;
    public HashMap i;
    public tr1_1 j;

    public l73() {
        int[] nArray = new int[]{};
        this.a = nArray;
        Object object = new Object[]{};
        this.c = object;
        this.h = object;
    }

    public final Iterable a() {
        return this;
    }

    public final Ae c(int n3) {
        boolean bl2 = this.f;
        int n4 = 1;
        int n7 = 0;
        if (bl2 ^= n4) {
            int n8;
            bl2 = false;
            ArrayList arrayList = null;
            if (n3 >= 0 && n3 < (n8 = this.b)) {
                bl2 = true;
            }
            if (bl2) {
                Ae ae2;
                arrayList = this.h;
                n7 = this.b;
                if ((n7 = n73.q(arrayList, n3, n7)) < 0) {
                    ae2 = new Ae(n3);
                    n3 = -(n7 += n4);
                    arrayList.add(n3, ae2);
                } else {
                    Object e2 = arrayList.get(n7);
                    ae2 = e2;
                    ae2 = (Ae)e2;
                }
                return ae2;
            }
            sn2.b("Parameter index is out of range");
            throw null;
        }
        p30_0.c("use active SlotWriter to create an anchor location instead");
        throw null;
    }

    public final int d(Ae ae2) {
        boolean bl2 = this.f ^ true;
        if (bl2) {
            bl2 = ae2.a();
            if (bl2) {
                return ae2.a;
            }
            sn2.b("Anchor refers to a group that was removed");
            throw null;
        }
        p30_0.c("Use active SlotWriter to determine anchor location instead");
        throw null;
    }

    public final void g() {
        HashMap hashMap;
        this.i = hashMap = new HashMap();
    }

    public final k73 h() {
        int n3 = this.f;
        if (n3 == 0) {
            this.e = n3 = this.e + 1;
            k73 k732 = new k73(this);
            return k732;
        }
        String string2 = "Cannot read while a writer is pending".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final q73 i() {
        int n3 = this.f;
        int n4 = 1;
        if ((n3 ^= n4) != 0) {
            q73 q732;
            n3 = this.e;
            if (n3 <= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                q732 = null;
            }
            if (n3 != 0) {
                this.f = n4;
                this.g = n3 = this.g + n4;
                q732 = new q73(this);
                return q732;
            }
            p30_0.c("Cannot start a writer when a reader is pending");
            throw null;
        }
        p30_0.c("Cannot start a writer when another writer is pending");
        throw null;
    }

    public final Iterator iterator() {
        int n3 = this.b;
        p11_0 p11_02 = new p11_0(this, 0, n3);
        return p11_02;
    }

    public final boolean j(Ae ae2) {
        ArrayList arrayList;
        boolean bl2;
        int n3;
        int n4;
        ArrayList arrayList2;
        int n7 = ae2.a();
        if (n7 != 0 && (n7 = n73.q(arrayList2 = this.h, n4 = ae2.a, n3 = this.b)) >= 0 && (bl2 = Intrinsics.areEqual(arrayList2 = (arrayList = this.h).get(n7), ae2))) {
            bl2 = true;
        } else {
            bl2 = false;
            ae2 = null;
        }
        return bl2;
    }

    public final Q11 l(int n3) {
        HashMap hashMap = this.i;
        Q11 q11 = null;
        if (hashMap != null) {
            int n4 = this.f ^ 1;
            if (n4 != 0) {
                Object object;
                ArrayList arrayList;
                if (n3 >= 0 && n3 < (n4 = this.b) && (n3 = n73.q(arrayList = this.h, n3, n4)) >= 0) {
                    object = (Ae)arrayList.get(n3);
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object = hashMap.get(object);
                    q11 = object;
                    q11 = (Q11)object;
                }
            } else {
                p30_0.c("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
        }
        return q11;
    }
}

