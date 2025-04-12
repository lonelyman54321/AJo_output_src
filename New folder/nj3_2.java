/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from NJ3
 */
public final class nj3_2
implements View.OnClickListener {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ nj3_2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        this.a = ref$BooleanRef;
        this.b = ref$ObjectRef;
        this.c = ref$ObjectRef2;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$isMuted");
        Ref$ObjectRef ref$ObjectRef = this.b;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$imgVolume");
        Object object2 = this.c;
        String string2 = "$ajioVideoPlayer";
        Intrinsics.checkNotNullParameter(object2, string2);
        boolean bl3 = object.element;
        if (bl3) {
            string2 = (ImageView)ref$ObjectRef.element;
            if (string2 != null) {
                int n3 = R$string.video_mute;
                String string3 = hv3_0.K(n3);
                string2.setContentDescription((CharSequence)string3);
            }
            if ((object2 = (ob_2)((Ref$ObjectRef)object2).element) != null) {
                ((ob_2)object2).n();
            }
            if ((ref$ObjectRef = (ImageView)ref$ObjectRef.element) != null) {
                int n4 = R$drawable.volume_on;
                ref$ObjectRef.setImageResource(n4);
            }
        } else {
            string2 = (ImageView)ref$ObjectRef.element;
            if (string2 != null) {
                int n7 = R$string.video_unmute;
                String string4 = hv3_0.K(n7);
                string2.setContentDescription((CharSequence)string4);
            }
            if ((object2 = (ob_2)((Ref$ObjectRef)object2).element) != null) {
                ((ob_2)object2).i();
            }
            if ((ref$ObjectRef = (ImageView)ref$ObjectRef.element) != null) {
                int n8 = R$drawable.volume_off;
                ref$ObjectRef.setImageResource(n8);
            }
        }
        object.element = bl2 = object.element ^ true;
    }
}

