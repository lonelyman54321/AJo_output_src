/*
 * Decompiled with CFR 0.152.
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.d;

/*
 * Renamed from VZ0
 */
public final class vz0_1
implements nj1_2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final cl2_2 intercept(nj1$a object) {
        Exception exception2;
        Object object2;
        block11: {
            String string2;
            boolean bl2;
            Object object3;
            int n3;
            int n4;
            Object object4;
            block10: {
                String string3;
                Object object5;
                double d2;
                long l2;
                long l3;
                Intrinsics.checkNotNullParameter(object, "chain");
                object4 = h40_0.a;
                n4 = 0;
                object4 = null;
                object2 = h40_0.Q(false);
                n3 = object2.optBoolean("metrics_master");
                object = (te2_2)object;
                object3 = ((te2_2)object).e;
                object = ((te2_2)object).a((kj2_2)object3);
                if (n3 == 0) return object;
                try {
                    object2 = ((cl2_2)object).h;
                    l3 = 0L;
                    double d5 = 0.0;
                    if (object2 != null) {
                        l2 = ((cl2_2)object2).k;
                    } else {
                        l2 = l3;
                        d2 = d5;
                    }
                    if (object2 != null) {
                        l3 = ((cl2_2)object2).l;
                    }
                    l3 -= l2;
                    object2 = ((cl2_2)object).g;
                    if (object2 != null) {
                        l2 = ((il2_2)object2).c();
                    } else {
                        l2 = -1;
                        d2 = 0.0 / 0.0;
                    }
                    d2 = l2;
                    double d7 = 1024.0;
                    d2 /= d7;
                    if (object2 == null || (object2 = ((il2_2)object2).d()) == null || (object2 = ((jn1_0)object2).a) == null) {
                        object2 = "Unknown";
                    }
                    object5 = "#.##";
                    DecimalFormat decimalFormat = new DecimalFormat((String)object5);
                    object5 = RoundingMode.CEILING;
                    decimalFormat.setRoundingMode((RoundingMode)((Object)object5));
                    string3 = decimalFormat.format(d2);
                    String string4 = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    d2 = Double.parseDouble(string3);
                    decimalFormat = h40_0.Q(false);
                    object5 = "fqdn_master";
                    bl2 = decimalFormat.optBoolean((String)object5);
                    object3 = ((kj2_2)object3).a;
                    object3 = ((ob1_1)object3).i;
                    object5 = ".gif";
                    boolean bl3 = true;
                    boolean bl4 = StringsKt.F((CharSequence)object3, (CharSequence)object5, bl3);
                    object5 = h40_0.Q(false);
                    String string5 = "is_metrics_required_image";
                    boolean bl5 = object5.optBoolean(string5);
                    object4 = h40_0.Q(false);
                    string5 = "is_metrics_required_gif";
                    n4 = object4.optBoolean(string5);
                    if ((bl4 || !bl5) && (!bl4 || n4 == 0)) break block10;
                    object4 = dc_2.a;
                }
                catch (Exception exception2) {
                    break block11;
                }
                l2 = (long)d2;
                object5 = new StringBuilder();
                ((StringBuilder)object5).append(l2);
                string3 = "|";
                ((StringBuilder)object5).append(string3);
                ((StringBuilder)object5).append(l3);
                string2 = ((StringBuilder)object5).toString();
                object3 = new Pair(object2, string2);
                ((LinkedList)object4).offer(object3);
            }
            if ((n4 = ((LinkedList)(object4 = dc_2.a)).size()) != (n3 = 20)) return object;
            object4 = bl2 ? Dc$a.JIO_CDN : Dc$a.AKAMAI;
            object2 = "server";
            Intrinsics.checkNotNullParameter(object4, (String)object2);
            object2 = ir0_2.a;
            object2 = em0_2.b;
            object2 = d.a((CoroutineContext)object2);
            string2 = null;
            object3 = new ec_2((Dc$a)((Object)object4), null);
            n4 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object3, n4);
            return object;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).g(exception2);
        return object;
    }
}

