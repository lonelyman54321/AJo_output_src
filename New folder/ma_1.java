/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.net.Uri
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from mA
 */
public final class ma_1
implements Callable {
    public final /* synthetic */ kd1_1 a;

    public /* synthetic */ ma_1(kd1_1 kd1_12) {
        this.a = kd1_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        BitmapFactory.Options options;
        Object object;
        Object object2;
        block15: {
            block12: {
                Exception exception3;
                block13: {
                    Object object3;
                    Object object4;
                    String string2;
                    String string3;
                    block14: {
                        block8: {
                            Exception exception22;
                            block11: {
                                boolean bl2;
                                String string4;
                                block10: {
                                    block9: {
                                        Bitmap.Config config;
                                        object2 = "";
                                        object = ".";
                                        string3 = "xyz";
                                        string2 = "bottomTabs";
                                        object4 = this.a;
                                        Intrinsics.checkNotNullParameter(object4, "$imageDetails");
                                        options = new BitmapFactory.Options();
                                        options.inPreferredConfig = config = Bitmap.Config.ARGB_8888;
                                        aa_1.a.getClass();
                                        config = null;
                                        try {
                                            object3 = AJIOApplication.Companion;
                                            object3.getClass();
                                            object3 = AJIOApplication$a.a();
                                            object3 = object3.getCacheDir();
                                            if (object3 == null) break block8;
                                            string4 = ((kd1_1)object4).a;
                                            string4 = Uri.parse((String)string4);
                                            if ((string4 = string4.getPath()) == null) break block9;
                                            string4 = StringsKt.W(string4);
                                            break block10;
                                        }
                                        catch (Exception exception22) {
                                            break block11;
                                        }
                                    }
                                    bl2 = false;
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    string4 = b.n(string4, (String)object, (String)object2, false);
                                } else {
                                    bl2 = false;
                                    string4 = null;
                                }
                                StringBuilder stringBuilder = new StringBuilder(string2);
                                stringBuilder.append(string4);
                                string4 = stringBuilder.toString();
                                File file = new File((File)object3, string4);
                                object3 = new File(file, string3);
                                bl2 = ((File)object3).exists();
                                if (!bl2 || !(bl2 = ((File)object3).isFile())) break block8;
                                break block14;
                            }
                            yn3$a yn3$a = yn3_0.a;
                            yn3$a.e(exception22);
                        }
                        object3 = null;
                    }
                    if (object3 != null) {
                        object = BitmapFactory.decodeFile((String)((File)object3).getAbsolutePath(), (BitmapFactory.Options)options);
                        return new qy_2((Bitmap)object);
                    }
                    try {
                        object3 = AJIOApplication.Companion;
                        object3.getClass();
                        object3 = AJIOApplication$a.a();
                        object3 = object3.getExternalCacheDir();
                        if (object3 != null) {
                            object4 = ((kd1_1)object4).a;
                            object4 = Uri.parse((String)object4);
                            object4 = (object4 = object4.getPath()) != null ? StringsKt.W((String)object4) : null;
                        }
                        break block12;
                    }
                    catch (Exception exception3) {
                        break block13;
                    }
                    object2 = object4 != null ? b.n((String)object4, (String)object, (String)object2, false) : null;
                    object4 = new StringBuilder(string2);
                    ((StringBuilder)object4).append((String)object2);
                    object2 = ((StringBuilder)object4).toString();
                    object = new File((File)object3, (String)object2);
                    object2 = new File((File)object, string3);
                    boolean bl3 = ((File)object2).exists();
                    if (!bl3 || !(bl3 = ((File)object2).isFile())) break block12;
                    break block15;
                }
                object = yn3_0.a;
                ((yn3$a)object).e(exception3);
            }
            object2 = null;
        }
        if (object2 == null) return new qy_2(null);
        object2 = BitmapFactory.decodeFile((String)((File)object2).getAbsolutePath(), (BitmapFactory.Options)options);
        object = new qy_2((Bitmap)object2);
        return object;
    }
}

