/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$c;
import com.facebook.d;
import com.facebook.e;
import com.facebook.j;
import com.jio.jioads.videomodule.s;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Ei1
 */
public final class ei1_0
implements kJ0$a,
js0_0 {
    public static void a(s object, StringBuilder stringBuilder, String string2) {
        object = ((s)object).R();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean bl2) {
        Object object;
        block16: {
            Object object2;
            Object[] objectArray = null;
            int n3 = 1;
            if (!bl2) return;
            object = rd0.b;
            synchronized (object) {
                object2 = FacebookSdk.a;
                boolean bl3 = j.c();
                if (bl3) {
                    rd0$a.a();
                }
                if ((object2 = rd0.c) != null) {
                } else {
                    rd0 rd02;
                    object2 = Thread.getDefaultUncaughtExceptionHandler();
                    rd0.c = rd02 = new rd0((Thread.UncaughtExceptionHandler)object2);
                    Thread.setDefaultUncaughtExceptionHandler(rd02);
                }
            }
            object = kJ0$b.CrashShield;
            bl2 = kj0_0.b((kJ0$b)((Object)object));
            if (!bl2) break block16;
            sC0.a = n3;
            boolean bl4 = true;
            while (true) {
                block15: {
                    block18: {
                        block19: {
                            int n4;
                            int n7;
                            block17: {
                                if (!bl4 || (bl4 = false)) break block17;
                                bl2 = j.c();
                                if (!bl2 || (bl2 = lz3_0.y())) break block18;
                                object = ii1_0.b();
                                if (object == null) {
                                    object = new File[]{};
                                } else {
                                    object2 = new Object();
                                    if ((object = object.listFiles((FilenameFilter)object2)) == null) {
                                        object = new File[]{};
                                    }
                                }
                                object2 = new ArrayList();
                                n7 = ((File[])object).length;
                                n4 = 0;
                            }
                            if (n4 >= n7) break block19;
                            Object object3 = Di1$a.c(object[n4]);
                            boolean bl5 = ((Di1)object3).a();
                            if (!bl5) break block15;
                            JSONObject jSONObject = new JSONObject();
                            Object object4 = "crash_shield";
                            try {
                                Object object5 = ((Di1)object3).toString();
                                jSONObject.put((String)object4, object5);
                                object4 = GraphRequest.j;
                                object4 = StringCompanionObject.INSTANCE;
                                object4 = "%s/instruments";
                                object5 = FacebookSdk.b();
                                Object[] objectArray2 = new Object[n3];
                                objectArray2[0] = object5;
                                object5 = Arrays.copyOf(objectArray2, n3);
                                object4 = String.format((String)object4, object5);
                                object5 = "format(format, *args)";
                                Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                                object5 = new rC0((Di1)object3);
                                object3 = null;
                                object3 = GraphRequest$c.i(null, (String)object4, jSONObject, (GraphRequest$b)object5);
                                ((ArrayList)object2).add(object3);
                                break block15;
                            }
                            catch (JSONException jSONException) {}
                        }
                        bl2 = ((ArrayList)object2).isEmpty();
                        if (!bl2) {
                            object = new e((Collection)object2);
                            object2 = GraphRequest.j;
                            Intrinsics.checkNotNullParameter(object, "requests");
                            Xz3.e((Collection)object);
                            object2 = new d((e)object);
                            object = FacebookSdk.d();
                            objectArray = new Void[]{};
                            object2.executeOnExecutor((Executor)object, objectArray);
                        }
                    }
                    td0.b = n3;
                    break;
                }
                n4 += n3;
            }
        }
        if (bl2 = kj0_0.b((kJ0$b)((Object)(object = kJ0$b.ThreadCheck)))) {
            bl2 = wm3_0.a;
        }
    }

    public double c(double d2) {
        return d2;
    }
}

