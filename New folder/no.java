/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Bundle
 */
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.google.android.gms.internal.icing.zzcm;
import com.ril.ajio.data.repo.HomeRepo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class no
implements kJ0$a,
bx0_2 {
    public static int a(int n3, int n4, int n7, int n8) {
        return zzcm.zzw(n3) + n4 + n7 + n8;
    }

    public static void c(int n3, int n4, int n7, HashMap hashMap, String string2) {
        Integer n8 = Color.rgb((int)n3, (int)n4, (int)n7);
        hashMap.put(string2, n8);
    }

    public Object apply(Object object) {
        return HomeRepo.X((Throwable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean bl2) {
        Throwable throwable2;
        Class<dh2_0> clazz;
        block12: {
            Object object;
            Object object2;
            block11: {
                Exception exception2;
                block10: {
                    NoClassDefFoundError noClassDefFoundError2;
                    block9: {
                        if (!bl2) return;
                        object2 = dh2_0.a;
                        object2 = "https://www.";
                        clazz = dh2_0.class;
                        boolean bl3 = td0.b(clazz);
                        if (bl3) {
                            return;
                        }
                        try {
                            Object object3 = FacebookSdk.a();
                            object = new a01_0((Context)object3);
                            dh2_0.b = object;
                            object3 = new StringBuilder((String)object2);
                            object2 = FacebookSdk.t;
                            ((StringBuilder)object3).append((String)object2);
                            object2 = "/privacy_sandbox/pa/logic";
                            ((StringBuilder)object3).append((String)object2);
                            object2 = dh2_0.a;
                            bl2 = false;
                            object2 = null;
                            try {
                                bf0_0.a();
                                throw null;
                            }
                            catch (NoSuchMethodError noSuchMethodError) {
                            }
                            catch (NoClassDefFoundError noClassDefFoundError2) {
                                break block9;
                            }
                            catch (Exception exception2) {
                                break block10;
                            }
                            object = ((Object)noSuchMethodError).toString();
                            ((Object)noSuchMethodError).toString();
                            break block11;
                        }
                        catch (Throwable throwable2) {
                            break block12;
                        }
                    }
                    object = ((Object)noClassDefFoundError2).toString();
                    ((Object)noClassDefFoundError2).toString();
                    break block11;
                }
                object = ((Object)exception2).toString();
                ((Object)exception2).toString();
            }
            Object object4 = dh2_0.b;
            if (object4 == null) {
                object4 = "gpsDebugLogger";
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object2 = object4;
            }
            object4 = "gps_pa_failed";
            Bundle bundle = new Bundle();
            String string2 = "gps_pa_failed_reason";
            bundle.putString(string2, (String)object);
            object = Unit.a;
            ((a01_0)object2).a(bundle, (String)object4);
            return;
        }
        td0.a(clazz, throwable2);
    }
}

