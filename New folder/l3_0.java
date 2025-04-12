/*
 * Decompiled with CFR 0.152.
 */
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;

/*
 * Renamed from l3
 */
public final class l3_0
implements e92 {
    public final /* synthetic */ n3_0 a;
    public final /* synthetic */ InstallReferrerClient b;

    public /* synthetic */ l3_0(n3_0 n3_02, InstallReferrerClient installReferrerClient) {
        this.a = n3_02;
        this.b = installReferrerClient;
    }

    public final void onSuccess(Object object) {
        object = (ReferrerDetails)object;
        Object object2 = this.a.b;
        Object object3 = "Install Referrer data set [Referrer URL-";
        CharSequence charSequence = ((ReferrerDetails)object).getInstallReferrer();
        Object object4 = ((k3_0)object2).f;
        CleverTapInstanceConfig cleverTapInstanceConfig = ((k3_0)object2).d;
        long l2 = ((ReferrerDetails)object).getReferrerClickTimestampSeconds();
        ((E80)object4).p = l2;
        l2 = ((ReferrerDetails)object).getInstallBeginTimestampSeconds();
        ((E80)object4).a = l2;
        object = ((k3_0)object2).a;
        ((we)object).a0((String)charSequence);
        boolean bl2 = true;
        ((E80)object4).i = bl2;
        object = cleverTapInstanceConfig.b();
        object4 = new StringBuilder((String)object3);
        ((StringBuilder)object4).append((String)charSequence);
        object3 = "]";
        ((StringBuilder)object4).append((String)object3);
        object3 = ((StringBuilder)object4).toString();
        try {
            object.getClass();
            com.clevertap.android.sdk.b.f((String)object3);
        }
        catch (NullPointerException nullPointerException) {
            object3 = ((k3_0)object2).d.b();
            charSequence = ((k3_0)object2).d.a;
            object4 = "Install referrer client null pointer exception caused by Google Play Install Referrer library - ";
            charSequence = new StringBuilder((String)object4);
            String string2 = ((Throwable)nullPointerException).getMessage();
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
            object3.getClass();
            com.clevertap.android.sdk.b.f(string2);
            this.b.endConnection();
            bl2 = false;
            string2 = null;
            object2 = ((k3_0)object2).f;
            ((E80)object2).i = false;
        }
    }
}

