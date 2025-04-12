/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CD2
extends qg3_2
implements Function2 {
    public final /* synthetic */ wd2_0 a;

    public CD2(wd2_0 wd2_02, f80_0 f80_02) {
        this.a = wd2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wd2_0 wd2_02 = this.a;
        object = new CD2(wd2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (CD2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CD2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = 1;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        wd2_0 wd2_02 = this.a;
        object2 = wd2_02.N;
        int n4 = ((ArrayList)object2).isEmpty() ^ n3;
        if (n4 != 0) {
            boolean bl2;
            Iterator iterator = wd2_02.N.iterator();
            n4 = 0;
            object2 = null;
            while (bl2 = iterator.hasNext()) {
                Object object3 = iterator.next();
                int n7 = n4 + 1;
                if (n4 >= 0) {
                    Object object4;
                    Object object5 = ((UploadImageAttributes)(object3 = (UploadImageAttributes)object3)).getViewType();
                    boolean bl3 = Intrinsics.areEqual(object5, object4 = "REVIEW_IMAGE");
                    if (bl3 && !(bl3 = ((UploadImageAttributes)object3).isCompressed()) && (object5 = ((UploadImageAttributes)object3).getImagePath()) != null) {
                        double d2;
                        long l2;
                        double d5;
                        double d7;
                        long l3;
                        double d9;
                        long l4;
                        object4 = new File((String)object5);
                        object5 = "<this>";
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        int n8 = ((File)object4).exists();
                        if (n8 == 0) {
                            l4 = 0L;
                            d9 = 0.0;
                        } else {
                            l4 = ((File)object4).length();
                            d9 = l4;
                        }
                        n8 = 0x44800000;
                        float f5 = 1024.0f;
                        double d12 = f5;
                        d9 = d9 / d12 / d12;
                        yn3$a yn3$a = yn3_0.a;
                        String string2 = ((File)object4).getName();
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        boolean bl4 = ((File)object4).exists();
                        if (!bl4) {
                            l3 = 0L;
                            d7 = 0.0;
                        } else {
                            l3 = ((File)object4).length();
                            d7 = l3;
                        }
                        d7 = d7 / d12 / d12;
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        Intrinsics.checkNotNullParameter(object4, (String)object5);
                        bl3 = ((File)object4).exists();
                        if (!bl3) {
                            object5 = object3;
                            d5 = 0.0;
                        } else {
                            object5 = object3;
                            l2 = ((File)object4).length();
                            d5 = d2 = (double)l2;
                        }
                        d2 = d5 / d12;
                        StringBuilder stringBuilder = new StringBuilder("File name is :");
                        stringBuilder.append(string2);
                        String string3 = ", file size in MB is :";
                        stringBuilder.append(string3);
                        stringBuilder.append(d7);
                        stringBuilder.append(", file size in KB is :");
                        stringBuilder.append(d2);
                        Object object6 = stringBuilder.toString();
                        Object object7 = new Object[]{};
                        yn3$a.a((String)object6, (Object[])object7);
                        object6 = h40_0.a;
                        object6 = h40_0.m0();
                        object7 = "reviewImageSizeInMB";
                        bl2 = object6.has((String)object7);
                        if (bl2) {
                            d2 = object6.getDouble((String)object7);
                        } else {
                            l2 = 4609434218613702656L;
                            d2 = 1.5;
                        }
                        n3 = d9 == d2 ? 0 : (d9 > d2 ? 1 : -1);
                        if (n3 > 0) {
                            block27: {
                                object6 = ((UploadImageAttributes)object5).getImageUri();
                                object7 = new pD2(n4, wd2_02, (UploadImageAttributes)object5);
                                object3 = new qD2(n4, wd2_02, (UploadImageAttributes)object5);
                                object5 = wd2_02.getContext();
                                object4 = wd2_02.S;
                                object2 = new me1_2((Context)object5, (ty2_2)object4);
                                object2 = ((me1_2)object2).a((Uri)object6, (o60_0)object7, (o60_0)object3);
                                if (object2 == null) break block27;
                                object6 = wd2_02.R;
                                object6 = ((hh3_2)object6).getValue();
                                object6 = (t30_0)object6;
                                try {
                                    ((t30_0)object6).b((yr0_2)object2);
                                }
                                catch (Exception exception) {
                                    object6 = yn3_0.a;
                                    ((yn3$a)object6).e(exception);
                                }
                            }
                            n3 = 1;
                        } else {
                            object6 = n4;
                            ((UploadImageAttributes)object5).setImagePosition((Integer)object6);
                            n3 = 1;
                            ((UploadImageAttributes)object5).setCompressed(n3 != 0);
                            object7 = ((File)object4).getName();
                            ((UploadImageAttributes)object5).setFileName((String)object7);
                            ((UploadImageAttributes)object5).setImageUploadStatus("IN_PROGRESS");
                            wd2_02.N.set(n4, object5);
                            object7 = wd2_02.M;
                            if (object7 != null) {
                                ((RecyclerView$f)object7).notifyItemChanged(n4);
                            }
                            wd2_02.jb(n4, (UploadImageAttributes)object5);
                        }
                    }
                    n4 = n7;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        return Unit.a;
    }
}

