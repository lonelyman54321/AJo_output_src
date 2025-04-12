/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ScrollCaptureSession
 */
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class H20$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ H20 b;
    public final /* synthetic */ ScrollCaptureSession c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ Consumer e;

    public H20$c(H20 h20, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, f80_0 f80_02) {
        this.b = h20;
        this.c = scrollCaptureSession;
        this.d = rect;
        this.e = consumer;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ScrollCaptureSession scrollCaptureSession = this.c;
        Rect rect = this.d;
        Consumer consumer = this.e;
        H20 h20 = this.b;
        object = new H20$c(h20, scrollCaptureSession, rect, consumer, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (H20$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((H20$c)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.c;
            Rect rect = this.d;
            int n7 = rect.left;
            int n8 = rect.top;
            int n10 = rect.right;
            int n14 = rect.bottom;
            Vi1 vi1 = new Vi1(n7, n8, n10, n14);
            this.a = n4;
            H20 h20 = this.b;
            object = H20.a(h20, (ScrollCaptureSession)object, vi1, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (Vi1)object;
        Consumer consumer = this.e;
        object = cf_2.d((Vi1)object);
        yx_0.b(consumer, (Rect)object);
        return Unit.a;
    }
}

