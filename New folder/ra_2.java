/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 */
import android.graphics.Bitmap;
import android.net.Uri;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from rA
 */
public final class ra_2
implements Callable {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ String b;

    public /* synthetic */ ra_2(String string2, Bitmap bitmap) {
        this.a = bitmap;
        this.b = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        String string2;
        Object[] objectArray;
        Object object;
        Object object2;
        block17: {
            Exception exception3;
            block18: {
                int n3;
                String string3;
                block20: {
                    Object object3;
                    Object object4;
                    Object object5;
                    String string4;
                    String string5;
                    block15: {
                        Exception exception22;
                        block16: {
                            block19: {
                                object2 = "";
                                object = ".";
                                objectArray = this.a;
                                string3 = "xyz";
                                string5 = "bottomTabs";
                                string2 = this.b;
                                Intrinsics.checkNotNullParameter(string2, "$url");
                                aa_1.a.getClass();
                                n3 = 100;
                                string4 = null;
                                try {
                                    object5 = AJIOApplication.Companion;
                                    object5.getClass();
                                    object5 = AJIOApplication$a.a();
                                    object5 = object5.getCacheDir();
                                    if (object5 != null) {
                                        object4 = Uri.parse((String)string2);
                                        object4 = (object4 = object4.getPath()) != null ? StringsKt.W((String)object4) : null;
                                    }
                                    break block15;
                                }
                                catch (Exception exception22) {
                                    break block16;
                                }
                                object4 = object4 != null ? kotlin.text.b.n((String)object4, (String)object, (String)object2, false) : null;
                                StringBuilder stringBuilder = new StringBuilder(string5);
                                stringBuilder.append((String)object4);
                                object4 = stringBuilder.toString();
                                object3 = new File((File)object5, (String)object4);
                                boolean bl2 = ((File)object3).exists();
                                if (bl2) break block19;
                                ((File)object3).mkdirs();
                                bl2 = ((File)object3).exists();
                                if (!bl2) break block15;
                            }
                            object5 = new File((File)object3, string3);
                            object4 = new FileOutputStream((File)object5);
                            if (objectArray != null) {
                                object5 = Bitmap.CompressFormat.PNG;
                                objectArray.compress((Bitmap.CompressFormat)object5, n3, (OutputStream)object4);
                            }
                            ((OutputStream)object4).flush();
                            ((FileOutputStream)object4).close();
                            return Unit.a;
                        }
                        object4 = yn3_0.a;
                        ((yn3$a)object4).e(exception22);
                    }
                    object5 = yn3_0.a;
                    object4 = kp1_0.c("Cannot save to internal cache directory, trying on external cache directory with url : ", string2);
                    object3 = new Object[]{};
                    ((yn3$a)object5).d((String)object4, (Object[])object3);
                    try {
                        object5 = AJIOApplication.Companion;
                        object5.getClass();
                        object5 = AJIOApplication$a.a();
                        object5 = object5.getExternalCacheDir();
                        if (object5 != null) {
                            object4 = Uri.parse((String)string2);
                        }
                        break block17;
                    }
                    catch (Exception exception3) {
                        break block18;
                    }
                    if ((object4 = (object4 = object4.getPath()) != null ? StringsKt.W((String)object4) : null) != null) {
                        string4 = kotlin.text.b.n((String)object4, (String)object, (String)object2, false);
                    }
                    object = new StringBuilder(string5);
                    ((StringBuilder)object).append(string4);
                    object = ((StringBuilder)object).toString();
                    object2 = new File((File)object5, (String)object);
                    boolean bl3 = ((File)object2).exists();
                    if (bl3) break block20;
                    ((File)object2).mkdirs();
                    bl3 = ((File)object2).exists();
                    if (!bl3) break block17;
                }
                object = new File((File)object2, string3);
                object2 = new FileOutputStream((File)object);
                if (objectArray != null) {
                    object = Bitmap.CompressFormat.PNG;
                    objectArray.compress((Bitmap.CompressFormat)object, n3, (OutputStream)object2);
                }
                ((OutputStream)object2).flush();
                ((FileOutputStream)object2).close();
                return Unit.a;
            }
            object = yn3_0.a;
            ((yn3$a)object).e(exception3);
        }
        object2 = yn3_0.a;
        object = kp1_0.c("Cannot save to external cache directory also with url : ", string2);
        objectArray = new Object[]{};
        ((yn3$a)object2).d((String)object, objectArray);
        return Unit.a;
    }
}

