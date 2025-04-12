/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.i;
import androidx.navigation.i$b;
import androidx.navigation.j$a;
import androidx.navigation.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.b;

public class j
extends i
implements Iterable,
KMappedMarker {
    public static final /* synthetic */ int o;
    public final ca3 k;
    public int l;
    public String m;
    public String n;

    public j(p object) {
        Intrinsics.checkNotNullParameter(object, "navGraphNavigator");
        super((p)object);
        this.k = object = new ca3(0);
    }

    public final i$b c(pT1 pT12) {
        Intrinsics.checkNotNullParameter(pT12, "navDeepLinkRequest");
        return this.g(pT12, false, this);
    }

    public final i e(String string2, boolean bl2) {
        Object object;
        Object object2;
        block6: {
            boolean bl3;
            block5: {
                Object object3;
                String string3;
                boolean bl4;
                Intrinsics.checkNotNullParameter(string2, "route");
                object2 = this.k;
                Intrinsics.checkNotNullParameter(object2, "<this>");
                Iterator iterator = new fa3_0((ca3)object2);
                iterator = ez2_1.b(iterator).iterator();
                do {
                    bl3 = iterator.hasNext();
                    object = null;
                    if (!bl3) break block5;
                    object3 = object2 = iterator.next();
                    object3 = (i)object2;
                } while (!(bl4 = kotlin.text.b.i(string3 = ((i)object3).h, string2, false)) && (object3 = ((i)object3).d(string2)) == null);
                break block6;
            }
            bl3 = false;
            object2 = null;
        }
        if ((object2 = (i)object2) == null) {
            j j3;
            if (bl2 && (j3 = this.b) != null) {
                boolean bl5;
                Intrinsics.checkNotNull(j3);
                if (string2 != null && !(bl5 = kotlin.text.b.k(string2))) {
                    bl5 = true;
                    object = j3.e(string2, bl5);
                }
            }
        } else {
            object = object2;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        Object object2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) return false;
        boolean bl3 = object instanceof j;
        if (!bl3) return false;
        bl3 = super.equals(object);
        if (!bl3) return false;
        Object object3 = this.k;
        int n3 = ((ca3)object3).j();
        object = (j)object;
        ca3 ca32 = ((j)object).k;
        int n4 = ca32.j();
        if (n3 != n4) return false;
        n3 = this.l;
        int n7 = ((j)object).l;
        if (n3 != n7) return false;
        Intrinsics.checkNotNullParameter(object3, "<this>");
        object = new fa3_0((ca3)object3);
        object = ez2_1.b((Iterator)object).iterator();
        do {
            if (!(bl3 = object.hasNext())) return bl2;
        } while (bl3 = Intrinsics.areEqual(object3 = (i)object.next(), object2 = ca32.f(n3 = ((i)object3).g)));
        return false;
    }

    public final i f(int n3, i i3, i i8, boolean bl2) {
        i i10;
        Object object;
        Object object2;
        block11: {
            boolean bl3;
            boolean bl4;
            object2 = this.k;
            object = (i)((ca3)object2).f(n3);
            i10 = null;
            if (i8 != null) {
                j j3;
                j j5;
                bl4 = Intrinsics.areEqual(object, i8);
                if (bl4 && (bl4 = Intrinsics.areEqual(j5 = ((i)object).b, j3 = i8.b))) {
                    return object;
                }
                bl3 = false;
                object = null;
            } else if (object != null) {
                return object;
            }
            if (bl2) {
                Intrinsics.checkNotNullParameter(object2, "<this>");
                object = new fa3_0((ca3)object2);
                object2 = ez2_1.b((Iterator)object).iterator();
                while (bl3 = object2.hasNext()) {
                    object = (i)object2.next();
                    bl4 = object instanceof j;
                    if (bl4 && !(bl4 = Intrinsics.areEqual(object, i3))) {
                        object = (j)object;
                        bl4 = true;
                        object = ((j)object).f(n3, this, i8, bl4);
                    } else {
                        bl3 = false;
                        object = null;
                    }
                    if (object == null) continue;
                    break block11;
                }
                bl3 = false;
                object = null;
            }
        }
        if (object == null) {
            boolean bl5;
            object2 = this.b;
            if (object2 != null && !(bl5 = Intrinsics.areEqual(object2, i3))) {
                i3 = this.b;
                Intrinsics.checkNotNull(i3);
                i10 = ((j)i3).f(n3, this, i8, bl2);
            }
        } else {
            i10 = object;
        }
        return i10;
    }

    public final i$b g(pT1 objectArray, boolean bl2, i i3) {
        i$b i$b;
        boolean bl3 = true;
        Intrinsics.checkNotNullParameter(objectArray, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(i3, "lastVisited");
        i$b i$b2 = super.c((pT1)objectArray);
        Object object = new ArrayList();
        KMappedMarker kMappedMarker = new j$a(this);
        while (true) {
            boolean bl4 = ((j$a)kMappedMarker).hasNext();
            i$b = null;
            if (!bl4) break;
            i i8 = (i)((j$a)kMappedMarker).next();
            boolean bl5 = Intrinsics.areEqual(i8, i3);
            if (!bl5) {
                i$b = i8.c((pT1)objectArray);
            }
            if (i$b == null) continue;
            ((ArrayList)object).add(i$b);
        }
        object = (i$b)CollectionsKt.U(object);
        kMappedMarker = this.b;
        if (kMappedMarker != null && bl2 && !(bl2 = Intrinsics.areEqual(kMappedMarker, i3))) {
            i$b = ((j)kMappedMarker).g((pT1)objectArray, bl3, this);
        }
        objectArray = new i$b[3];
        objectArray[0] = i$b2;
        objectArray[bl3] = object;
        objectArray[2] = i$b;
        Intrinsics.checkNotNullParameter(objectArray, "elements");
        return (i$b)CollectionsKt.U(tp_2.y(objectArray));
    }

    public final i$b h(String objectArray, boolean bl2, i i3) {
        i$b i$b;
        boolean bl3 = true;
        Intrinsics.checkNotNullParameter(objectArray, "route");
        Intrinsics.checkNotNullParameter(i3, "lastVisited");
        i$b i$b2 = this.d((String)objectArray);
        Object object = new ArrayList();
        KMappedMarker kMappedMarker = new j$a(this);
        while (true) {
            boolean bl4 = ((j$a)kMappedMarker).hasNext();
            boolean bl5 = false;
            i$b = null;
            if (!bl4) break;
            i i8 = (i)((j$a)kMappedMarker).next();
            boolean bl6 = Intrinsics.areEqual(i8, i3);
            if (!bl6) {
                bl5 = i8 instanceof j;
                if (bl5) {
                    i8 = (j)i8;
                    i$b = ((j)i8).h((String)objectArray, false, this);
                } else {
                    i$b = i8.d((String)objectArray);
                }
            }
            if (i$b == null) continue;
            ((ArrayList)object).add(i$b);
        }
        object = (i$b)CollectionsKt.U(object);
        kMappedMarker = this.b;
        if (kMappedMarker != null && bl2 && !(bl2 = Intrinsics.areEqual(kMappedMarker, i3))) {
            i$b = ((j)kMappedMarker).h((String)objectArray, bl3, this);
        }
        objectArray = new i$b[3];
        objectArray[0] = i$b2;
        objectArray[bl3] = object;
        objectArray[2] = i$b;
        Intrinsics.checkNotNullParameter(objectArray, "elements");
        return (i$b)CollectionsKt.U(tp_2.y(objectArray));
    }

    public final int hashCode() {
        int n3 = this.l;
        ca3 ca32 = this.k;
        int n4 = ca32.j();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = ca32.g(i3);
            i i8 = (i)ca32.k(i3);
            n3 = (n3 * 31 + n7) * 31;
            n7 = i8.hashCode();
            n3 += n7;
        }
        return n3;
    }

    public final void i(String object) {
        Object object2;
        block4: {
            block5: {
                int n3;
                block3: {
                    block2: {
                        if (object != null) break block2;
                        n3 = 0;
                        Object var3_3 = null;
                        break block3;
                    }
                    object2 = this.h;
                    n3 = Intrinsics.areEqual(object, object2) ^ 1;
                    if (n3 == 0) break block4;
                    n3 = kotlin.text.b.k((CharSequence)object) ^ 1;
                    if (n3 == 0) break block5;
                    object2 = "android-app://androidx.navigation/".concat((String)object);
                    n3 = ((String)object2).hashCode();
                }
                this.l = n3;
                this.n = object;
                return;
            }
            object2 = "Cannot have an empty start destination route".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = new StringBuilder("Start destination ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" cannot use the same route as the graph ");
        ((StringBuilder)object2).append(this);
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final Iterator iterator() {
        j$a j$a = new j$a(this);
        return j$a;
    }

    public final String toString() {
        int n3;
        boolean bl2;
        CharSequence charSequence = new StringBuilder();
        Object object = super.toString();
        ((StringBuilder)charSequence).append((String)object);
        object = this.n;
        int n4 = 0;
        String string2 = null;
        if (object != null && !(bl2 = kotlin.text.b.k((CharSequence)object))) {
            bl2 = true;
            object = this.e((String)object, bl2);
        } else {
            n3 = 0;
            object = null;
        }
        if (object == null) {
            n3 = this.l;
            bl2 = false;
            object = this.f(n3, this, null, false);
        }
        string2 = " startDestination=";
        ((StringBuilder)charSequence).append(string2);
        if (object == null) {
            object = this.n;
            if (object != null) {
                ((StringBuilder)charSequence).append((String)object);
            } else {
                object = this.m;
                if (object != null) {
                    ((StringBuilder)charSequence).append((String)object);
                } else {
                    object = new StringBuilder("0x");
                    n4 = this.l;
                    string2 = Integer.toHexString(n4);
                    ((StringBuilder)object).append(string2);
                    object = ((StringBuilder)object).toString();
                    ((StringBuilder)charSequence).append((String)object);
                }
            }
        } else {
            string2 = "{";
            ((StringBuilder)charSequence).append(string2);
            object = ((i)object).toString();
            ((StringBuilder)charSequence).append((String)object);
            object = "}";
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

