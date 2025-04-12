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
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dY1
 */
public final class dy1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dy1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = "this$0";
                zm2_2 zm2_22 = (zm2_2)this.b;
                Intrinsics.checkNotNullParameter(zm2_22, (String)object);
                n3 = (int)(zm2_22.o ? 1 : 0);
                if (n3 == 0) {
                    zm2_22.Pa();
                } else {
                    n3 = 0;
                    zm2_22.o = false;
                    object = zm2_22.k;
                    String string2 = "selectedIconCheck";
                    Object object2 = null;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                    }
                    int n4 = R$drawable.rounded_rect_4_black_stroke;
                    ((AppCompatImageView)((Object)object)).setBackgroundResource(n4);
                    object = zm2_22.k;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                    }
                    int n7 = R$color.accent_color_11;
                    ((AppCompatImageView)((Object)object)).setImageResource(n7);
                    object = zm2_22.e;
                    string2 = "tvUploadImage";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                    }
                    n4 = R$drawable.rounded_rect_disable;
                    Drawable drawable2 = hv3_0.r(n4);
                    object.setBackground(drawable2);
                    object = zm2_22.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object2 = object;
                    }
                    n3 = hv3_0.m(R$color.color_a5a5a5);
                    object2.setTextColor(n3);
                }
                return;
            }
            case 0: 
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog)this.b;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$closetDeleteDialog");
        bottomSheetDialog.dismiss();
    }
}

