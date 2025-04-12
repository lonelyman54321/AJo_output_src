/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 */
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from LS1$a
 */
public final class ls1$a_0 {
    public final UUID a;
    public final Bitmap b;
    public final Uri c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public ls1$a_0(UUID object, Bitmap object2, Uri object3) {
        block17: {
            boolean bl2;
            boolean bl3;
            String string2;
            Object[] objectArray;
            int n3;
            block16: {
                int n4;
                block15: {
                    n3 = 4;
                    objectArray = "callId";
                    Intrinsics.checkNotNullParameter(object, (String)objectArray);
                    this.a = object;
                    this.b = object2;
                    this.c = object3;
                    n4 = 1;
                    if (object3 == null) break block15;
                    string2 = "content";
                    object2 = object3.getScheme();
                    bl3 = string2.equalsIgnoreCase((String)object2);
                    if (bl3) {
                        this.f = n4;
                        object2 = object3.getAuthority();
                        if (object2 != null && !(bl2 = kotlin.text.b.s((String)object2, string2 = "media", false))) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        this.g = bl2;
                    } else {
                        String string3 = "file";
                        string2 = object3.getScheme();
                        bl3 = string3.equalsIgnoreCase(string2);
                        if (bl3) {
                            this.g = n4;
                        } else {
                            bl3 = lz3_0.B(object3);
                            if (!bl3) {
                                object2 = kp1_0.c("Unsupported scheme for media Uri : ", (String)object2);
                                object = new FacebookException((String)object2);
                                throw object;
                            }
                        }
                    }
                    break block16;
                }
                if (object2 == null) break block17;
                this.g = n4;
            }
            bl2 = this.g;
            if (!bl2) {
                bl2 = false;
                object2 = null;
            } else {
                object2 = UUID.randomUUID().toString();
            }
            this.e = object2;
            bl3 = this.g;
            if (!bl3) {
                object = String.valueOf(object3);
            } else {
                int n7 = FacebookContentProvider.a;
                object3 = FacebookSdk.b();
                Intrinsics.checkNotNullParameter(object, (String)objectArray);
                objectArray = StringCompanionObject.INSTANCE;
                object = ((UUID)object).toString();
                objectArray = new Object[n3];
                string2 = "content://com.facebook.app.FacebookContentProvider";
                objectArray[0] = string2;
                objectArray[n4] = object3;
                n7 = 2;
                objectArray[n7] = object;
                int n8 = 3;
                objectArray[n8] = object2;
                object2 = "format(format, *args)";
                object = xh2_0.a(objectArray, n3, "%s%s/%s/%s", (String)object2);
            }
            this.d = object;
            return;
        }
        super("Cannot share media without a bitmap or Uri set");
        throw object;
    }
}

