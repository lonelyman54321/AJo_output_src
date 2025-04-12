/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipDescription
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.ResultReceiver
 *  android.text.TextUtils
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputConnectionWrapper
 */
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class Kh1
extends InputConnectionWrapper {
    public final /* synthetic */ ih1_0 a;

    public Kh1(InputConnection inputConnection, ih1_0 ih1_02) {
        this.a = ih1_02;
        super(inputConnection, false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean performPrivateCommand(String string2, Bundle bundle) {
        int n3;
        boolean bl2;
        block10: {
            void var1_4;
            String string3;
            block9: {
                String string4;
                String string5;
                boolean bl3;
                String string6;
                ih1_0 ih1_02;
                block12: {
                    block11: {
                        ih1_02 = this.a;
                        bl2 = true;
                        n3 = 0;
                        if (bundle == null) break block10;
                        string6 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
                        bl3 = TextUtils.equals((CharSequence)string6, (CharSequence)string2);
                        if (!bl3) break block11;
                        bl3 = false;
                        string6 = null;
                        break block12;
                    }
                    string6 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
                    bl3 = TextUtils.equals((CharSequence)string6, (CharSequence)string2);
                    if (!bl3) break block10;
                    bl3 = true;
                }
                string3 = bl3 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                try {
                    string3 = bundle.getParcelable(string3);
                    string3 = (ResultReceiver)string3;
                    string5 = bl3 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
                catch (Throwable throwable) {
                    string3 = null;
                    break block9;
                }
                try {
                    string5 = bundle.getParcelable(string5);
                    string5 = (Uri)string5;
                    string4 = bl3 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                catch (Throwable throwable) {
                    break block9;
                }
                string4 = bundle.getParcelable(string4);
                string4 = (ClipDescription)string4;
                String string7 = bl3 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                string7 = bundle.getParcelable(string7);
                string7 = (Uri)string7;
                String string8 = bl3 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                int n4 = bundle.getInt(string8);
                string6 = bl3 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                string6 = bundle.getParcelable(string6);
                string6 = (Bundle)string6;
                if (string5 != null && string4 != null) {
                    Lh1 lh1 = new Lh1((Uri)string5, (ClipDescription)string4, (Uri)string7);
                    n3 = ih1_02.a(lh1, n4, (Bundle)string6) ? 1 : 0;
                }
                if (string3 != null) {
                    string3.send(n3, null);
                }
                break block10;
            }
            if (string3 != null) {
                string3.send(0, null);
            }
            throw var1_4;
        }
        if (n3 != 0) {
            return bl2;
        }
        return super.performPrivateCommand(string2, bundle);
    }
}

