/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.graphics.drawable.Drawable;
import android.view.View;
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$d;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from iI
 */
public final class ii_1
implements View.OnClickListener {
    public final /* synthetic */ CTInboxBaseMessageViewHolder a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ii_1(CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder, MediaPlayerRecyclerView$d mediaPlayerRecyclerView$d) {
        this.a = cTInboxBaseMessageViewHolder;
        this.b = mediaPlayerRecyclerView$d;
    }

    public final void onClick(View object) {
        object = this.a;
        object.getClass();
        Float f5 = (Float)this.b.invoke();
        float f6 = f5.floatValue();
        int n3 = 0;
        float f7 = f6 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 > 0) {
            f5 = ((CTInboxBaseMessageViewHolder)object).l;
            object = ((CTInboxBaseMessageViewHolder)object).a.getResources();
            n3 = R$drawable.ct_volume_off;
            object = object.getDrawable(n3, null);
            f5.setImageDrawable((Drawable)object);
        } else if (f8 == false) {
            f5 = ((CTInboxBaseMessageViewHolder)object).l;
            object = ((CTInboxBaseMessageViewHolder)object).a.getResources();
            n3 = R$drawable.ct_volume_on;
            object = object.getDrawable(n3, null);
            f5.setImageDrawable((Drawable)object);
        }
    }
}

