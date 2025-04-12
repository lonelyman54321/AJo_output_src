/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetricsInt
 *  android.text.style.ReplacementSpan
 */
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

public abstract class Ty0
extends ReplacementSpan {
    public final Paint.FontMetricsInt a;
    public final rt3 b;
    public short c;
    public float d;

    public Ty0(rt3 rt32) {
        Paint.FontMetricsInt fontMetricsInt;
        this.a = fontMetricsInt = new Paint.FontMetricsInt();
        this.c = (short)-1;
        this.d = 1.0f;
        B41.c(rt32, "rasterizer cannot be null");
        this.b = rt32;
    }

    public final int getSize(Paint object, CharSequence charSequence, int n3, int n4, Paint.FontMetricsInt fontMetricsInt) {
        float f5;
        charSequence = this.a;
        object.getFontMetricsInt((Paint.FontMetricsInt)charSequence);
        int n7 = ((Paint.FontMetricsInt)charSequence).descent;
        n3 = ((Paint.FontMetricsInt)charSequence).ascent;
        n7 = Math.abs(n7 - n3);
        float f6 = n7;
        n3 = 1065353216;
        float f7 = 1.0f;
        f6 *= f7;
        rt3 rt32 = this.b;
        Object object2 = rt32.c();
        int n8 = 14;
        int n10 = ((di3_1)object2).a(n8);
        short s7 = 0;
        if (n10 != 0) {
            ByteBuffer byteBuffer = ((di3_1)object2).b;
            n4 = ((di3_1)object2).a;
            n10 += n4;
            n4 = byteBuffer.getShort(n10);
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        f5 = n4;
        this.d = f6 /= f5;
        object = rt32.c();
        n4 = ((di3_1)object).a(n8);
        if (n4 != 0) {
            ByteBuffer byteBuffer = ((di3_1)object).b;
            n7 = ((di3_1)object).a;
            byteBuffer.getShort(n4 += n7);
        }
        object = rt32.c();
        f7 = 1.7E-44f;
        n3 = ((di3_1)object).a(12);
        if (n3 != 0) {
            object2 = ((di3_1)object).b;
            n7 = ((di3_1)object).a;
            s7 = ((ByteBuffer)object2).getShort(n3 += n7);
        }
        f6 = s7;
        f7 = this.d;
        n7 = (short)(f6 *= f7);
        this.c = (short)n7;
        if (fontMetricsInt != null) {
            int n14;
            fontMetricsInt.ascent = n3 = ((Paint.FontMetricsInt)charSequence).ascent;
            fontMetricsInt.descent = n3 = ((Paint.FontMetricsInt)charSequence).descent;
            fontMetricsInt.top = n3 = ((Paint.FontMetricsInt)charSequence).top;
            fontMetricsInt.bottom = n14 = ((Paint.FontMetricsInt)charSequence).bottom;
        }
        return n7;
    }
}

