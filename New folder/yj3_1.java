/*
 * Decompiled with CFR 0.152.
 */
import ai.haptik.android.wrapper.sdk.HaptikSDK$a;
import ai.haptik.android.wrapper.sdk.model.Response;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YJ3
 */
public final class yj3_1
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ yj3_1(long l2, String string2, String string3, HaptikSDK$a haptikSDK$a) {
        this.a = l2;
        this.b = string2;
        this.c = string3;
        this.d = haptikSDK$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        IOException iOException2;
        Object object;
        Function1 function1;
        CharSequence charSequence;
        Object object2;
        block10: {
            String string2;
            block6: {
                block7: {
                    block9: {
                        boolean bl2;
                        String string3;
                        block8: {
                            long l2;
                            String string4;
                            string3 = "";
                            object2 = this.b;
                            Intrinsics.checkNotNullParameter(object2, "$customCSSFileURL");
                            charSequence = this.c;
                            Intrinsics.checkNotNullParameter(charSequence, "$filePath");
                            function1 = this.d;
                            object = "$callback";
                            Intrinsics.checkNotNullParameter(function1, (String)object);
                            try {
                                object = yl0.a;
                                string2 = "helper";
                                if (object == null) break block6;
                                string4 = "custom_css_download_timestamp";
                                long l3 = 1640975400000L;
                                l2 = object.getLong(string4, l3);
                                object = yl0.a;
                                if (object == null) break block7;
                                String string5 = "custom_css_file_url";
                                object = object.getString(string5, string3);
                                Intrinsics.checkNotNull(object);
                                string5 = "helper.getString(CUSTOM_CSS_FILE_URL, \"\")!!";
                                Intrinsics.checkNotNullExpressionValue(object, string5);
                            }
                            catch (IOException iOException2) {}
                            long l4 = System.currentTimeMillis() - l2;
                            l2 = ak3_2.a;
                            l4 /= l2;
                            l2 = this.a;
                            bl2 = true;
                            long l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
                            if (l7 >= 0) break block8;
                            boolean bl3 = Intrinsics.areEqual(object, object2);
                            if (!bl3) break block8;
                            string4 = "/haptik-custom-css/haptik-custom-css.css";
                            object = new File(string4 = Intrinsics.stringPlus((String)charSequence, string4));
                            bl3 = ((File)object).exists();
                            if (!bl3) break block8;
                            object2 = yl0.a;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                throw null;
                            }
                            charSequence = "custom_css_file_local_path";
                            string3 = object2.getString((String)charSequence, string3);
                            Intrinsics.checkNotNull(string3);
                            object2 = "helper.getString(CUSTOM_CSS_FILE_LOCAL_PATH, \"\")!!";
                            Intrinsics.checkNotNullExpressionValue(string3, (String)object2);
                            object2 = new Response(bl2, string3);
                            break block9;
                            break block10;
                        }
                        string3 = zj3_2.a((String)object2, (String)charSequence);
                        object2 = new Response(bl2, string3);
                    }
                    function1.invoke(object2);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            throw null;
        }
        object = "Error while downloading Custom CSS file (";
        charSequence = new StringBuilder((String)object);
        String string6 = iOException2.getMessage();
        ((StringBuilder)charSequence).append((Object)string6);
        char c2 = ')';
        ((StringBuilder)charSequence).append(c2);
        string6 = ((StringBuilder)charSequence).toString();
        charSequence = null;
        object2 = new Response(false, string6);
        function1.invoke(object2);
    }
}

