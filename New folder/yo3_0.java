/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;

/*
 * Renamed from yo3
 */
public final class yo3_0 {
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager.LayoutParams d;
    public final Rect e;
    public final int[] f;
    public final int[] g;

    public yo3_0(Context object) {
        int n3;
        Object object2;
        WindowManager.LayoutParams layoutParams;
        this.d = layoutParams = new WindowManager.LayoutParams();
        this.e = object2 = new Rect();
        int n4 = 2;
        int[] nArray = new int[n4];
        this.f = nArray;
        object2 = new int[n4];
        this.g = (int[])object2;
        this.a = object;
        object2 = LayoutInflater.from((Context)object);
        int n7 = R$layout.abc_tooltip;
        object2 = object2.inflate(n7, null);
        this.b = object2;
        n7 = R$id.message;
        object2 = (TextView)object2.findViewById(n7);
        this.c = object2;
        object2 = yo3_0.class.getSimpleName();
        layoutParams.setTitle((CharSequence)object2);
        object = object.getPackageName();
        layoutParams.packageName = object;
        layoutParams.type = 1002;
        layoutParams.width = n3 = -2;
        layoutParams.height = n3;
        layoutParams.format = -3;
        layoutParams.windowAnimations = n3 = R$style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}

