/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 *  android.graphics.ColorSpace
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$ImageInfo
 *  android.graphics.ImageDecoder$OnHeaderDecodedListener
 *  android.graphics.ImageDecoder$Source
 */
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Gd1$c
implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ gd1_0 b;
    public final /* synthetic */ Ref$BooleanRef c;

    public Gd1$c(Ref$ObjectRef ref$ObjectRef, gd1_0 gd1_02, Ref$BooleanRef booleanRef) {
        this.a = ref$ObjectRef;
        this.b = gd1_02;
        this.c = booleanRef;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo object, ImageDecoder.Source object2) {
        int n3;
        int n4;
        block8: {
            double d2;
            int n7;
            block9: {
                int n8;
                int n10;
                object2 = this.a;
                ((Ref$ObjectRef)object2).element = imageDecoder;
                object = Hd1.a((ImageDecoder.ImageInfo)object);
                n4 = object.getWidth();
                n7 = object.getHeight();
                Object object3 = this.b.b;
                Object object4 = object3.d;
                Object object5 = B63.c;
                boolean bl2 = Intrinsics.areEqual(object4, object5);
                if (bl2) {
                    n10 = n4;
                } else {
                    object4 = ((B63)object4).a;
                    object3 = object3.e;
                    n10 = f.b((wq0)object4, (WS2)((Object)object3));
                }
                object4 = this.b.b;
                Object object6 = ((ba2)object4).d;
                boolean n32 = Intrinsics.areEqual(object6, object5);
                if (n32) {
                    n8 = n7;
                } else {
                    object5 = object6.b;
                    object4 = ((ba2)object4).e;
                    n8 = f.b((wq0)object5, (WS2)((Object)object4));
                }
                n3 = 1;
                if (n4 <= 0 || n7 <= 0 || n4 == n10 && n7 == n8) break block8;
                object6 = this.b.b.e;
                d2 = cj0_0.a(n4, n7, n10, n8, (WS2)((Object)object6));
                object6 = this.c;
                double d5 = 1.0;
                double d7 = d2 - d5;
                double d9 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                boolean bl3 = d9 < 0;
                ((Ref$BooleanRef)object6).element = bl3;
                if (bl3) break block9;
                object6 = this.b.b;
                bl2 = ((ba2)object6).f;
                if (bl2) break block8;
            }
            n4 = ok1_1.a((double)n4 * d2);
            double d12 = n7;
            n7 = ok1_1.a(d2 *= d12);
            Id1.a(imageDecoder, n4, n7);
        }
        object = this.b.b;
        object2 = ((ba2)object).b;
        n4 = f.a((Bitmap.Config)object2) ? 1 : 0;
        n4 = n4 != 0 ? 3 : 1;
        rd1.a(imageDecoder, n4);
        n4 = ((ba2)object).g ^ n3;
        sd1.a(imageDecoder, n4);
        object2 = ((ba2)object).c;
        if (object2 != null) {
            td1.a(imageDecoder, (ColorSpace)object2);
        }
        n4 = ((ba2)object).h ^ n3;
        ud1.b(imageDecoder, n4 != 0);
        object = (Hm2$b)((ba2)object).l.a.get("coil#animated_transformation");
        vd1.a(imageDecoder);
    }
}

