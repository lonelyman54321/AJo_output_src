/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.EditText
 */
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NO1
 */
public final class no1_1
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ po1_1 b;

    public /* synthetic */ no1_1(View view, po1_1 po1_12) {
        this.a = view;
        this.b = po1_12;
    }

    public final void run() {
        block4: {
            View view = this.a;
            po1_1 po1_12 = this.b;
            Class<po1_1> clazz = po1_1.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) break block4;
            String string2 = "$view";
            Intrinsics.checkNotNullParameter(view, string2);
            string2 = "this$0";
            Intrinsics.checkNotNullParameter(po1_12, string2);
            bl2 = view instanceof EditText;
            if (!bl2) break block4;
            try {
                po1_12.b(view);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

