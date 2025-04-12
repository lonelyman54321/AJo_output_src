/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.util.Base64
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class oI2
extends qg3_2
implements Function2 {
    public final /* synthetic */ QB1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public oI2(QB1 qB1, Context context, String string2, f80_0 f80_02) {
        this.a = qB1;
        this.b = context;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Context context = this.b;
        String string2 = this.c;
        QB1 qB1 = this.a;
        object = new oI2(qB1, context, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (oI2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oI2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object iterator) {
        boolean bl2;
        Object object = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(iterator);
        iterator = this.a.c().values().iterator();
        while (bl2 = iterator.hasNext()) {
            CharSequence charSequence;
            int n3;
            Object object2;
            object = (DC1)iterator.next();
            Intrinsics.checkNotNull(object);
            Object object3 = ((DC1)object).f;
            int n4 = 160;
            int n7 = 1;
            String string2 = ((DC1)object).d;
            if (object3 == null) {
                int n8;
                Intrinsics.checkNotNull(string2);
                object3 = "data:";
                object2 = null;
                n3 = kotlin.text.b.s(string2, (String)object3, false);
                if (n3 != 0 && (n3 = StringsKt.O(string2, (String)(object3 = "base64,"), 0, false, n8 = 6)) > 0) {
                    n3 = 44;
                    n3 = StringsKt.N(string2, (char)n3, 0, false, n8) + n7;
                    object3 = string2.substring(n3);
                    charSequence = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
                    object3 = Base64.decode((String)object3, (int)0);
                    charSequence = new BitmapFactory.Options();
                    ((BitmapFactory.Options)charSequence).inScaled = n7;
                    ((BitmapFactory.Options)charSequence).inDensity = n4;
                    int n10 = ((Bitmap)object3).length;
                    object3 = BitmapFactory.decodeByteArray((byte[])object3, (int)0, (int)n10, (BitmapFactory.Options)charSequence);
                    try {
                        ((DC1)object).f = object3;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object2 = "data URL did not have correct base64 format.";
                        rx1.c((String)object2, illegalArgumentException);
                    }
                }
            }
            object3 = this.b;
            object2 = ((DC1)object).f;
            if (object2 != null || (object2 = this.c) == null) continue;
            try {
                object3 = object3.getAssets();
            }
            catch (IOException iOException) {
                object3 = "Unable to open asset.";
                rx1.c((String)object3, iOException);
                continue;
            }
            charSequence = new StringBuilder();
            charSequence.append((String)object2);
            charSequence.append(string2);
            string2 = charSequence.toString();
            object3 = object3.open(string2);
            Intrinsics.checkNotNull(object3);
            string2 = null;
            object2 = new BitmapFactory.Options();
            object2.inScaled = n7;
            object2.inDensity = n4;
            try {
                string2 = BitmapFactory.decodeStream((InputStream)object3, null, (BitmapFactory.Options)object2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                String string3 = "Unable to decode image.";
                rx1.c(string3, illegalArgumentException);
            }
            if (string2 == null) continue;
            n3 = ((DC1)object).a;
            n4 = ((DC1)object).b;
            ((DC1)object).f = object3 = wz3.d((Bitmap)string2, n3, n4);
        }
        return Unit.a;
    }
}

