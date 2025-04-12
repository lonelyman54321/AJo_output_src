/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.widget.SectionIndexer
 */
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.home.category.revamp.fastscroll.AlphabetIndexRecyclerView;

/*
 * Renamed from de
 */
public final class de_1
extends RecyclerView$h {
    public float a;
    public float b;
    public float c;
    public int d;
    public boolean e;
    public AlphabetIndexRecyclerView f;
    public SectionIndexer g;
    public String[] h;
    public RectF i;
    public int j;
    public Typeface k;
    public Boolean l;
    public int m;
    public int n;
    public int o;

    public final boolean a(float f5, float f6) {
        float f7;
        float f8;
        float f11;
        float f12;
        RectF rectF = this.i;
        float f14 = rectF.left;
        float f15 = f5 - f14;
        Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object >= 0 && (f12 = (f11 = f6 - (f5 = rectF.top)) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) >= 0 && (object = (f8 = f6 - (f7 = rectF.height() + f5)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) <= 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public final int b(float f5) {
        int n3;
        RectF rectF = this.h;
        float f6 = 0.0f;
        if (rectF != null && (n3 = ((String[])rectF).length) != 0) {
            rectF = this.i;
            float f7 = rectF.top;
            float f8 = this.b;
            float f11 = f7 + f8;
            float f12 = f5 - f11;
            Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object < 0) {
                return 0;
            }
            float f14 = rectF.height() + f7 - f8;
            float f15 = f5 - f14;
            n3 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
            if (n3 >= 0) {
                return this.h.length + -1;
            }
            rectF = this.i;
            f6 = rectF.top;
            f5 = f5 - f6 - f8;
            f14 = rectF.height();
            f14 -= (f8 *= 2.0f);
            f6 = this.h.length;
            return (int)(f5 / (f14 /= f6));
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c() {
        SectionIndexer sectionIndexer;
        try {
            sectionIndexer = this.g;
        }
        catch (Exception exception) {
            return;
        }
        int n3 = this.d;
        int n4 = sectionIndexer.getPositionForSection(n3);
        Object object = this.f;
        object = ((RecyclerView)object).getLayoutManager();
        boolean bl2 = object instanceof LinearLayoutManager;
        if (bl2) {
            object = (LinearLayoutManager)object;
            bl2 = false;
            ((LinearLayoutManager)object).scrollToPositionWithOffset(n4, 0);
            return;
        }
        ((RecyclerView$o)object).scrollToPosition(n4);
    }

    public final void onChanged() {
        super.onChanged();
        String[] stringArray = (String[])this.g.getSections();
        this.h = stringArray;
    }
}

