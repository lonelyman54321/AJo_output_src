/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal.concurrent.b;

/*
 * Renamed from K91
 */
public final class k91_0
extends ri3_1 {
    public final /* synthetic */ G91$c e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ R03 g;

    public k91_0(String string2, G91$c g91$c, R03 r03) {
        this.e = g91$c;
        this.f = false;
        this.g = r03;
        super(string2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long a() {
        Throwable throwable2;
        block18: {
            Object object;
            S91[] s91Array;
            long l2;
            long l3;
            int n3;
            long l4;
            Object object2;
            Object object3;
            Object object4;
            block17: {
                boolean bl2;
                block16: {
                    object4 = this.e;
                    int n4 = this.f;
                    R03 r03 = this.g;
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(r03, "settings");
                    object3 = new Ref$ObjectRef();
                    object4 = ((G91$c)object4).b;
                    object2 = ((g91_0)object4).y;
                    // MONITORENTER : object2
                    try {
                        R03 r032 = ((g91_0)object4).s;
                        if (n4 == 0) {
                            R03 r033 = new R03();
                            r033.b(r032);
                            r033.b(r03);
                            r03 = r033;
                        }
                        ((Ref$ObjectRef)object3).element = r03;
                        n4 = r03.a();
                        l4 = n4;
                        long l7 = r032.a();
                        n3 = 0;
                        r032 = null;
                        l3 = 0L;
                        long l8 = (l4 -= l7) - l3;
                        l2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (l2 == false || (bl2 = (s91Array = ((g91_0)object4).c).isEmpty())) break block16;
                        s91Array = ((g91_0)object4).c;
                        s91Array = s91Array.values();
                        object = new S91[]{};
                        s91Array = s91Array.toArray((T[])object);
                        break block17;
                    }
                    catch (Throwable throwable2) {
                        break block18;
                    }
                }
                bl2 = false;
                s91Array = null;
            }
            object = ((Ref$ObjectRef)object3).element;
            object = (R03)object;
            CharSequence charSequence = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)charSequence);
            ((g91_0)object4).s = object;
            object = ((g91_0)object4).k;
            charSequence = new StringBuilder();
            Object object5 = ((g91_0)object4).d;
            ((StringBuilder)charSequence).append((String)object5);
            object5 = " onSettings";
            ((StringBuilder)charSequence).append((String)object5);
            charSequence = ((StringBuilder)charSequence).toString();
            object5 = new h91_0((String)charSequence, (g91_0)object4, (Ref$ObjectRef)object3);
            ((b)object).c((ri3_1)object5, l3);
            Object object6 = Unit.a;
            // MONITOREXIT : object4
            try {
                object6 = ((g91_0)object4).y;
                object3 = ((Ref$ObjectRef)object3).element;
                object3 = (R03)object3;
                ((t91_0)object6).a((R03)object3);
            }
            catch (IOException iOException) {
                ((g91_0)object4).b(iOException);
            }
            object4 = Unit.a;
            // MONITOREXIT : object2
            if (s91Array == null) return -1;
            int n7 = s91Array.length;
            while (n3 < n7) {
                object3 = s91Array[n3];
                // MONITORENTER : object3
                ((S91)object3).f = l3 = ((S91)object3).f + l4;
                if (l2 > 0) {
                    object2 = "null cannot be cast to non-null type java.lang.Object";
                    Intrinsics.checkNotNull(object3, (String)object2);
                    object3.notifyAll();
                }
                object2 = Unit.a;
                // MONITOREXIT : object3
                ++n3;
            }
            return -1;
        }
        // MONITOREXIT : object4
        throw throwable2;
    }
}

