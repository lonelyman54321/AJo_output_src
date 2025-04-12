/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.IntentSender$SendIntentException
 *  android.net.Uri
 */
import android.app.Activity;
import android.content.IntentSender;
import android.net.Uri;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.plp.PLPExtras$a;
import com.ril.ajio.plp.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from n4
 */
public final class n4_0
implements OnFailureListener,
w3 {
    public final /* synthetic */ Object a;

    public /* synthetic */ n4_0(Object object) {
        this.a = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Object object) {
        object = (Uri)object;
        Object object2 = (a)this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object != null) {
            String string2;
            block6: {
                File file;
                Object object4;
                object3 = ((a)object2).a;
                Intrinsics.checkNotNullParameter(object3, "context");
                string2 = null;
                try {
                    int n3;
                    object4 = object3.getContentResolver();
                    object4 = object4.openInputStream((Uri)object);
                    if (object4 == null) break block6;
                    long l2 = System.currentTimeMillis();
                    Object object5 = String.valueOf(l2);
                    object3 = object3.getCacheDir();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object5);
                    object5 = ".jpg";
                    stringBuilder.append((String)object5);
                    object5 = stringBuilder.toString();
                    file = new File((File)object3, (String)object5);
                    object3 = new FileOutputStream(file);
                    int n4 = 1024;
                    object5 = new byte[n4];
                    while ((n3 = ((InputStream)object4).read((byte[])object5)) > 0) {
                        ((FileOutputStream)object3).write((byte[])object5);
                    }
                }
                catch (Exception exception) {
                    break block6;
                }
                {
                    ((FileOutputStream)object3).close();
                    ((InputStream)object4).close();
                    string2 = file.getAbsolutePath();
                }
            }
            if (string2 != null) {
                boolean bl2;
                object3 = new PLPExtras$a();
                ((PLPExtras$a)object3).o = object;
                ((PLPExtras$a)object3).p = string2;
                ((PLPExtras$a)object3).q = object;
                ((PLPExtras$a)object3).r = string2;
                ((PLPExtras$a)object3).s = bl2 = true;
                ((PLPExtras$a)object3).t = bl2;
                object = ((PLPExtras$a)object3).a();
                object2 = ((a)object2).b;
                object2.Ha((PLPExtras)object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onFailure(Exception exception) {
        AddAddressFragment addAddressFragment = (AddAddressFragment)this.a;
        Intrinsics.checkNotNullParameter(addAddressFragment, "this$0");
        String string2 = "e";
        Intrinsics.checkNotNullParameter(exception, string2);
        boolean bl2 = exception instanceof ResolvableApiException;
        if (!bl2) return;
        try {
            exception = (ResolvableApiException)exception;
            string2 = addAddressFragment.u;
            Intrinsics.checkNotNull(string2);
            int n3 = 1234;
            ((ResolvableApiException)exception).startResolutionForResult((Activity)string2, n3);
            return;
        }
        catch (IntentSender.SendIntentException sendIntentException) {
            return;
        }
    }
}

