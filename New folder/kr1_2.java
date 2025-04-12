/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kR1
 */
public final class kr1_2
implements w3 {
    public final /* synthetic */ lr1_0 a;

    public /* synthetic */ kr1_2(lr1_0 lr1_02) {
        this.a = lr1_02;
    }

    public final void a(Object object) {
        Object object2;
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    object2 = object;
                    object2 = (Boolean)object;
                    bl2 = (Boolean)object2;
                    lr1_0 lr1_02 = this.a;
                    ArrayList<Object> arrayList = "this$0";
                    Intrinsics.checkNotNullParameter(lr1_02, (String)((Object)arrayList));
                    boolean bl3 = true;
                    if (bl2 != bl3) break block2;
                    String string2 = lr1_02.c;
                    Uri uri = lr1_02.d;
                    String string3 = "REVIEW_IMAGE";
                    String string4 = "START";
                    int n3 = 3576;
                    object2 = new UploadImageAttributes(string2, uri, string3, null, false, null, 0, null, null, string4, false, null, n3, null);
                    arrayList = new ArrayList<Object>();
                    arrayList.add(object2);
                    object2 = lr1_02.b;
                    object2.L0(arrayList);
                    break block3;
                }
                if (bl2) break block4;
            }
            return;
        }
        object2 = new NoWhenBranchMatchedException();
        throw object2;
    }
}

