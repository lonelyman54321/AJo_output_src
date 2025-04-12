/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Xfermode
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 */
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.os.Build;
import android.os.LocaleList;

/*
 * Renamed from bp1
 */
public final class bp1_1
extends Paint {
    public bp1_1(PorterDuff.Mode mode) {
        super(1);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        this.setXfermode((Xfermode)porterDuffXfermode);
    }

    public final void setAlpha(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 30;
        if (n4 < n7) {
            n4 = this.getColor();
            n3 = mp1_0.c(n3) << 24;
            n7 = 0xFFFFFF;
            this.setColor(n3 |= (n4 &= n7));
        } else {
            n3 = mp1_0.c(n3);
            super.setAlpha(n3);
        }
    }

    public final void setTextLocales(LocaleList localeList) {
    }
}

