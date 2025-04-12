/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.io.IOException;

/*
 * Renamed from th2
 */
public final class th2_2
implements i00_0 {
    public final /* synthetic */ wh2_2 a;

    public /* synthetic */ th2_2(wh2_2 wh2_22) {
        this.a = wh2_22;
    }

    public final void a(v00$a v00$a) {
        Object object;
        block6: {
            object = this.a;
            object.getClass();
            object = ((wh2_2)object).a();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) break block6;
            v00$a.a();
        }
        String string2 = "Unable to download.";
        object = new IOException(string2);
        try {
            v00$a.b((Throwable)object);
        }
        catch (Exception exception) {
            yn3_0.a(exception);
            v00$a.b(exception);
        }
    }
}

