/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I13
 */
public final class i13_0
implements Callable {
    public final /* synthetic */ n13_0 a;
    public final /* synthetic */ Context b;

    public /* synthetic */ i13_0(n13_0 n13_02, Context context) {
        this.a = n13_02;
        this.b = context;
    }

    public final Object call() {
        block18: {
            boolean bl2;
            String[] stringArray;
            Object object;
            block17: {
                block16: {
                    object = this.a;
                    Intrinsics.checkNotNullParameter(object, "this$0");
                    stringArray = "$context";
                    Context context = this.b;
                    Intrinsics.checkNotNullParameter(context, (String)stringArray);
                    object.getClass();
                    stringArray = context.getExternalCacheDir();
                    if (stringArray == null) break block16;
                    stringArray = stringArray.getAbsolutePath();
                    break block17;
                }
                bl2 = false;
                stringArray = null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((String)stringArray);
            stringArray = "/share/";
            ((StringBuilder)object).append((String)stringArray);
            stringArray = ((StringBuilder)object).toString();
            boolean bl3 = TextUtils.isEmpty((CharSequence)stringArray);
            if (bl3) break block18;
            object = new File((String)stringArray);
            bl2 = ((File)object).isDirectory();
            if (!bl2) break block18;
            stringArray = ((File)object).list();
            if (stringArray == null) break block18;
            int n3 = stringArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = stringArray[i3];
                try {
                    File file = new File((File)object, string2);
                    file.delete();
                    continue;
                }
                catch (Exception exception) {
                    object = yn3_0.a;
                    ((yn3$a)object).e(exception);
                    break;
                }
            }
        }
        return Unit.a;
    }
}

