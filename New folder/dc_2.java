/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/*
 * Renamed from Dc
 */
public final class dc_2 {
    public static final LinkedList a;
    public static final LinkedList b;
    public static final ks1_1 c;

    static {
        LinkedList linkedList;
        a = linkedList = new LinkedList();
        b = linkedList = new LinkedList();
        c = ls1_2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(Dc$a dc$a) {
        long l2;
        Object object;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        int n3;
        int n4;
        long l3;
        long l4;
        long l7;
        Object object2;
        boolean bl5;
        Object object3;
        block39: {
            block38: {
                Object object4;
                Object object5;
                Object object6;
                object3 = dc$a;
                bl5 = false;
                object2 = null;
                int n7 = 1;
                l4 = l7 = 0L;
                l3 = l7;
                int n8 = 0;
                n4 = 0;
                n3 = 0;
                while (true) {
                    long l8;
                    block37: {
                        block36: {
                            try {
                                while (bl4 = (object6 = b).isEmpty() ^ n7) {
                                    object6 = ((LinkedList)object6).remove();
                                    object6 = (Pair)object6;
                                    object5 = ((Pair)object6).a;
                                    object5 = (String)object5;
                                    object6 = ((Pair)object6).b;
                                    object6 = (CharSequence)object6;
                                    object4 = new char[n7];
                                    int n10 = 124;
                                    object4[0] = (JSONObject)n10;
                                    object6 = StringsKt.Z((CharSequence)object6, (char[])object4);
                                    object4 = "image/webp";
                                    bl3 = StringsKt.F((CharSequence)object5, (CharSequence)object4, false);
                                    if (bl3) {
                                        n8 += n7;
                                        object5 = object6.get(0);
                                        object5 = (String)object5;
                                        l8 = Long.parseLong((String)object5);
                                        l7 += l8;
                                        object6 = object6.get(n7);
                                        object6 = (String)object6;
                                        Long.parseLong((String)object6);
                                        continue;
                                    }
                                    object4 = "image/jpeg";
                                    bl3 = StringsKt.F((CharSequence)object5, (CharSequence)object4, false);
                                    if (!bl3 && !(bl3 = StringsKt.F((CharSequence)object5, (CharSequence)(object4 = "image/jpg"), false)) && !(bl3 = StringsKt.F((CharSequence)object5, (CharSequence)(object4 = "image/png"), false))) break block36;
                                    break block37;
                                }
                                break;
                            }
                            catch (Exception exception) {
                                return;
                            }
                        }
                        object4 = "image/gif";
                        bl4 = StringsKt.F((CharSequence)object5, (CharSequence)object4, false);
                        if (!bl4) continue;
                        n3 += n7;
                        object5 = object6.get(0);
                        object5 = (String)object5;
                        l8 = Long.parseLong((String)object5);
                        l3 += l8;
                        object6 = object6.get(n7);
                        object6 = (String)object6;
                        Long.parseLong((String)object6);
                        continue;
                    }
                    n4 += n7;
                    object5 = object6.get(0);
                    object5 = (String)object5;
                    l8 = Long.parseLong((String)object5);
                    l4 += l8;
                    object6 = object6.get(n7);
                    object6 = (String)object6;
                    Long.parseLong((String)object6);
                }
                if (n4 == 0 && n8 == 0 && n3 == 0) {
                    return;
                }
                object6 = h40_0.a;
                object6 = h40_0.Q(false);
                bl2 = object6.optBoolean("is_metrics_required_image");
                object5 = h40_0.Q(false);
                bl4 = object5.optBoolean("is_metrics_required_gif");
                object4 = h40_0.Q(false);
                bl3 = object4.optBoolean("is_replace_fqdn_image");
                Object object7 = "fqdn_master";
                if (bl3 && (bl3 = (object4 = h40_0.Q(false)).optBoolean((String)object7))) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object4 = null;
                }
                object = h40_0.Q(false);
                object2 = "is_replace_fqdn_gif";
                bl5 = object.optBoolean((String)object2);
                if (bl5) {
                    bl5 = false;
                    object2 = null;
                    object = h40_0.Q(false);
                    n7 = (int)(object.optBoolean((String)object7) ? 1 : 0);
                    if (n7 != 0) {
                        bl5 = true;
                    }
                } else {
                    bl5 = false;
                    object2 = null;
                }
                if (object3 == (object = Dc$a.AKAMAI)) {
                    object3 = fq2_1.j;
                    if (object3 == null) {
                        object3 = FirebasePerformance.getInstance();
                        object = "akamai-image-traces-android";
                        fq2_1.j = object3 = ((FirebasePerformance)object3).newTrace((String)object);
                    }
                    if ((object3 = fq2_1.j) != null) {
                        ((Trace)object3).start();
                    }
                } else {
                    object = Dc$a.JIO_CDN;
                    if (object3 == object) {
                        object3 = fq2_1.k;
                        if (object3 == null) {
                            object3 = FirebasePerformance.getInstance();
                            object = "jiocdn-image-traces-android";
                            fq2_1.k = object3 = ((FirebasePerformance)object3).newTrace((String)object);
                        }
                        if ((object3 = fq2_1.k) != null) {
                            ((Trace)object3).start();
                        }
                    }
                }
                object3 = "key";
                if (n8 <= 0 || !bl2) break block38;
                object = "image_size_webp";
                if (!bl3) {
                    object7 = fq2_1.a;
                    l2 = l3;
                    l3 = n8;
                    l7 /= l3;
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    Trace trace = fq2_1.j;
                    if (trace != null) {
                        trace.putMetric((String)object, l7);
                    }
                    break block39;
                } else {
                    l2 = l3;
                    Trace trace = fq2_1.a;
                    l3 = n8;
                    l7 /= l3;
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    trace = fq2_1.k;
                    if (trace != null) {
                        trace.putMetric((String)object, l7);
                    }
                }
                break block39;
            }
            l2 = l3;
        }
        if (n4 > 0 && bl2) {
            object = "image_size_pngjpeg";
            if (!bl3) {
                Trace trace = fq2_1.a;
                l7 = n4;
                l4 /= l7;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                trace = fq2_1.j;
                if (trace != null) {
                    trace.putMetric((String)object, l4);
                }
            } else {
                Trace trace = fq2_1.a;
                l7 = n4;
                l4 /= l7;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                trace = fq2_1.k;
                if (trace != null) {
                    trace.putMetric((String)object, l4);
                }
            }
        }
        if (n3 > 0 && bl4) {
            object = "image_size_gif";
            if (!bl5) {
                object2 = fq2_1.a;
                l7 = n3;
                l3 = l2 / l7;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = fq2_1.j;
                if (object3 != null) {
                    ((Trace)object3).putMetric((String)object, l3);
                }
            } else {
                object2 = fq2_1.a;
                l7 = n3;
                l3 = l2 / l7;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = fq2_1.k;
                if (object3 != null) {
                    ((Trace)object3).putMetric((String)object, l3);
                }
            }
        }
        if ((object3 = fq2_1.j) != null) {
            ((Trace)object3).stop();
        }
        object3 = null;
        fq2_1.j = null;
        object2 = fq2_1.k;
        if (object2 != null) {
            ((Trace)object2).stop();
        }
        fq2_1.k = null;
    }
}

