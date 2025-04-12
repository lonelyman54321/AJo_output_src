/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from xi1
 */
public final class xi1_2
implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient a;
    public final /* synthetic */ wi1_2 b;
    public final /* synthetic */ long c;

    public xi1_2(long l2, wi1_2 wi1_22, InstallReferrerClient installReferrerClient) {
        this.a = installReferrerClient;
        this.b = wi1_22;
        this.c = l2;
    }

    public final void onInstallReferrerServiceDisconnected() {
        long l2 = System.currentTimeMillis();
        long l3 = this.c;
        float f5 = l2 - l3;
        qu3 qu32 = new qu3(null, null, false, "service_disconnected", f5);
        this.b.a(qu32);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onInstallReferrerSetupFinished(int n3) {
        Object[] objectArray;
        block18: {
            qu3 qu32;
            boolean bl2;
            float f5;
            int n4;
            String string2;
            wi1_2 wi1_22;
            long l2;
            CharSequence charSequence;
            String string3;
            Object[] objectArray2;
            Object object;
            Object object2;
            Object object3;
            Object object4;
            block15: {
                Object object5;
                Object object6;
                block17: {
                    float f6;
                    block16: {
                        String string4;
                        Object object7;
                        object6 = this;
                        int n7 = 1;
                        f6 = Float.MIN_VALUE;
                        object4 = null;
                        object3 = "ajioapps";
                        object2 = this.a;
                        object = "containsDeeplink : ";
                        objectArray2 = "InstallReferrer - Utm source ";
                        string3 = "https://www.ajio.com?";
                        charSequence = "Referrer Url: ";
                        long l3 = System.currentTimeMillis();
                        l2 = this.c;
                        wi1_22 = this.b;
                        string2 = "InstallReferrerDeligate";
                        if (n3 != 0) {
                            if (n3 == n7) {
                                Object object8 = yn3_0.a;
                                ((yn3$a)object8).l(string2);
                                String string5 = "InstallReferrerResponse.SERVICE_UNAVAILABLE";
                                object4 = new Object[]{};
                                ((yn3$a)object8).d(string5, (Object[])object4);
                                float f7 = l3 -= l2;
                                objectArray2 = null;
                                string3 = "service_unavailable";
                                boolean bl3 = false;
                                object2 = null;
                                object = null;
                                object3 = object8;
                                object8 = new qu3(null, null, false, string3, f7);
                                wi1_22.a((qu3)object8);
                                return;
                            }
                            n7 = 2;
                            f6 = 2.8E-45f;
                            if (n3 != n7) {
                                return;
                            }
                            Object object9 = yn3_0.a;
                            ((yn3$a)object9).l(string2);
                            String string6 = "InstallReferrerResponse.FEATURE_NOT_SUPPORTED";
                            object4 = new Object[]{};
                            ((yn3$a)object9).d(string6, (Object[])object4);
                            float f8 = l3 -= l2;
                            objectArray2 = null;
                            string3 = "feature_not_supported";
                            boolean bl4 = false;
                            object2 = null;
                            object = null;
                            object3 = object9;
                            object9 = new qu3(null, null, false, string3, f8);
                            wi1_22.a((qu3)object9);
                            return;
                        }
                        try {
                            object5 = ((InstallReferrerClient)object2).getInstallReferrer();
                            object7 = null;
                            object5 = object5 != null ? ((ReferrerDetails)object5).getInstallReferrer() : null;
                        }
                        catch (RemoteException remoteException) {
                            objectArray = object2;
                            break block15;
                        }
                        yn3$a yn3$a = yn3_0.a;
                        object4 = new StringBuilder((String)charSequence);
                        ((StringBuilder)object4).append((String)object5);
                        object4 = ((StringBuilder)object4).toString();
                        n4 = 0;
                        f5 = 0.0f;
                        charSequence = null;
                        object6 = new Object[]{};
                        yn3$a.a((String)object4, (Object[])object6);
                        Intrinsics.checkNotNull(object5);
                        wi1_22.getClass();
                        object4 = Looper.getMainLooper();
                        object6 = new Handler((Looper)object4);
                        n4 = 0;
                        f5 = 0.0f;
                        charSequence = null;
                        object4 = new vi1_2(object5, 0);
                        object6.post((Runnable)object4);
                        object6 = new StringBuilder(string3);
                        ((StringBuilder)object6).append((String)object5);
                        object6 = ((StringBuilder)object6).toString();
                        object4 = Uri.parse((String)object6);
                        if (object4 != null) {
                            string3 = "utm_source";
                            string3 = object4.getQueryParameter(string3);
                        } else {
                            string3 = null;
                        }
                        if (object4 != null) {
                            charSequence = "utm_medium";
                            object4 = object4.getQueryParameter((String)charSequence);
                        } else {
                            object4 = null;
                        }
                        charSequence = new StringBuilder((String)objectArray2);
                        ((StringBuilder)charSequence).append(string3);
                        objectArray2 = " - utm medium ";
                        ((StringBuilder)charSequence).append((String)objectArray2);
                        ((StringBuilder)charSequence).append((String)object4);
                        objectArray2 = ((StringBuilder)charSequence).toString();
                        objectArray = object2;
                        n4 = 0;
                        f5 = 0.0f;
                        charSequence = null;
                        try {
                            int n8;
                            object2 = new Object[]{};
                            yn3$a.a((String)objectArray2, (Object[])object2);
                            object2 = wi1_22.a;
                            objectArray2 = "INSTALL_REFERRER";
                            n4 = 1;
                            f5 = Float.MIN_VALUE;
                            ((sw_0)object2).putPreference((String)objectArray2, n4 != 0);
                            yn3$a.l(string2);
                            object2 = "referrerUrl %s";
                            objectArray2 = new Object[n4];
                            n4 = 0;
                            f5 = 0.0f;
                            charSequence = null;
                            objectArray2[0] = object5;
                            yn3$a.d((String)object2, objectArray2);
                            yn3$a.l(string2);
                            object5 = "InstallReferrerResponse.OK";
                            object2 = new Object[]{};
                            yn3$a.d((String)object5, (Object[])object2);
                            object5 = Uri.parse((String)object6);
                            object2 = object6 = object5.getQueryParameterNames();
                            object2 = (Collection)object6;
                            if (object2 != null && !(bl2 = object2.isEmpty()) && (n8 = object6.contains(object2 = "deep_link_value")) != 0 && (object5 = object5.getQueryParameter((String)object2)) != null && (n8 = ((String)object5).length()) != 0) {
                                n8 = 0;
                                object6 = null;
                                bl2 = StringsKt.F((CharSequence)object5, (CharSequence)object3, false);
                                if (bl2) {
                                    object2 = "https";
                                    object5 = kotlin.text.b.n((String)object5, (String)object3, (String)object2, false);
                                }
                                object7 = object5;
                            }
                            object5 = object7;
                            yn3$a.l(string2);
                            object6 = new StringBuilder((String)object);
                            ((StringBuilder)object6).append((String)object7);
                            object6 = ((StringBuilder)object6).toString();
                            object3 = null;
                            object2 = new Object[]{};
                            yn3$a.d((String)object6, (Object[])object2);
                            n8 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
                            if (n8 == 0 || (n8 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0)) == 0) break block16;
                            string4 = "blank_utm_data";
                        }
                        catch (RemoteException remoteException) {}
                        f6 = l3 -= l2;
                        boolean bl5 = false;
                        object6 = new qu3(string3, (String)object4, false, string4, f6);
                        break block17;
                    }
                    String string7 = "success";
                    f6 = l3 -= l2;
                    boolean bl6 = true;
                    object6 = new qu3(string3, (String)object4, bl6, string7, f6);
                    break block15;
                }
                ((qu3)object6).g = object5;
                wi1_22.a((qu3)object6);
                break block18;
            }
            long l4 = System.currentTimeMillis();
            object4 = yn3_0.a;
            ((yn3$a)object4).l(string2);
            object3 = "InstallReferrerResponse.OK_RemoteException";
            bl2 = false;
            object2 = new Object[]{};
            ((yn3$a)object4).d((String)object3, (Object[])object2);
            ((yn3$a)object4).l(string2);
            ((yn3$a)object4).e((Throwable)((Object)qu32));
            float f11 = l4 -= l2;
            n4 = 0;
            f5 = 0.0f;
            charSequence = null;
            String string8 = "remote_exception";
            objectArray2 = null;
            string3 = null;
            object = qu32;
            qu32 = new qu3(null, null, false, string8, f11);
            wi1_22.a(qu32);
        }
        objectArray.endConnection();
    }
}

