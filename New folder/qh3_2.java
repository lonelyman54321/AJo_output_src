/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QH3
 */
public final class qh3_2
extends i0_0 {
    public final ni3_1 a;
    public final String b;
    public final DE0 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final List g;
    public boolean h;
    public K92 i;

    static {
        qx1.b("WorkContinuationImpl");
    }

    public qh3_2() {
        throw null;
    }

    public qh3_2(ni3_1 serializable, String object, DE0 dE0, List list) {
        this.a = serializable;
        this.b = object;
        this.c = dE0;
        this.d = list;
        this.g = null;
        int n3 = list.size();
        this.e = serializable = new Serializable(n3);
        this.f = serializable = new Serializable();
        serializable = null;
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            object = DE0.REPLACE;
            if (dE0 == object) {
                object = ((CI3)list.get((int)i3)).b;
                long l2 = ((EI3)object).u;
                long l3 = Long.MAX_VALUE;
                long l4 = l2 - l3;
                n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                if (n3 != 0) {
                    super("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                    throw serializable;
                }
            }
            object = ((CI3)list.get((int)i3)).a.toString();
            Intrinsics.checkNotNullExpressionValue(object, "id.toString()");
            this.e.add(object);
            ArrayList arrayList = this.f;
            arrayList.add(object);
        }
    }

    public qh3_2(ni3_1 ni3_12, List list) {
        DE0 dE0 = DE0.KEEP;
        this(ni3_12, null, dE0, list);
    }

    public static boolean R(qh3_2 object, HashSet hashSet) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3;
        block3: {
            String string2;
            boolean bl4;
            object3 = ((qh3_2)object).e;
            hashSet.addAll(object3);
            object3 = qh3_2.S((qh3_2)object);
            object2 = hashSet.iterator();
            do {
                bl4 = object2.hasNext();
                bl3 = true;
                if (!bl4) break block3;
            } while (!(bl4 = ((HashSet)object3).contains(string2 = (String)object2.next())));
            return bl3;
        }
        object3 = ((qh3_2)object).g;
        if (object3 != null && !(bl2 = object3.isEmpty())) {
            object3 = object3.iterator();
            while (bl2 = object3.hasNext()) {
                object2 = (qh3_2)object3.next();
                bl2 = qh3_2.R((qh3_2)object2, hashSet);
                if (!bl2) continue;
                return bl3;
            }
        }
        object = ((qh3_2)object).e;
        hashSet.removeAll((Collection<?>)object);
        return false;
    }

    public static HashSet S(qh3_2 object) {
        boolean bl2;
        HashSet hashSet = new HashSet();
        object = ((qh3_2)object).g;
        if (object != null && !(bl2 = object.isEmpty())) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                ArrayList arrayList = ((qh3_2)object.next()).e;
                hashSet.addAll(arrayList);
            }
        }
        return hashSet;
    }

    public final J92 Q() {
        boolean bl2 = this.h;
        if (!bl2) {
            Object object = this.a;
            S40 s40 = ((ni3_1)object).b.m;
            CharSequence charSequence = new StringBuilder("EnqueueRunnable_");
            Object object2 = this.c.name();
            charSequence.append((String)object2);
            charSequence = charSequence.toString();
            object = ((ni3_1)object).d.c();
            object2 = new ph3_1(this);
            this.i = object = O92.a(s40, (String)charSequence, (VZ2)object, (Function0)object2);
        } else {
            qx1 qx12 = qx1.a();
            ArrayList arrayList = this.e;
            String string2 = ", ";
            TextUtils.join((CharSequence)string2, (Iterable)arrayList);
            qx12.getClass();
        }
        return this.i;
    }
}

