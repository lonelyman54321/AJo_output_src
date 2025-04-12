/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from AY0
 */
public final class ay0_0
implements Runnable {
    public final /* synthetic */ GameZoneWebViewActivity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ ay0_0(GameZoneWebViewActivity gameZoneWebViewActivity, String string2, Ref$ObjectRef ref$ObjectRef) {
        this.a = gameZoneWebViewActivity;
        this.b = string2;
        this.c = ref$ObjectRef;
    }

    public final void run() {
        boolean bl2;
        Object object = GameZoneWebViewActivity.Companion;
        GameZoneWebViewActivity gameZoneWebViewActivity = this.a;
        Intrinsics.checkNotNullParameter(gameZoneWebViewActivity, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$gameName");
        Ref$ObjectRef ref$ObjectRef = this.c;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$absoluteUrl");
        gameZoneWebViewActivity.E0 = bl2 = true;
        object = gameZoneWebViewActivity.w0;
        if (object != null) {
            object.setText((CharSequence)string2);
        }
        if ((object = gameZoneWebViewActivity.z0) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" page");
            string2 = stringBuilder.toString();
            object.setContentDescription((CharSequence)string2);
        }
        object = (String)ref$ObjectRef.element;
        gameZoneWebViewActivity.D2((String)object);
    }
}

