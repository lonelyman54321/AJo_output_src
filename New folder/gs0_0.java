/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.DragEvent
 *  android.view.View
 *  android.view.View$OnDragListener
 */
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView$g;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Gs0
 */
public final class gs0_0
implements View.OnDragListener,
Ds0 {
    public final gx0_2 a;
    public final js0_1 b;
    public final Np c;
    public final DragAndDropModifierOnDragListener$modifier$1 d;

    public gs0_0(AndroidComposeView$g object) {
        fs0_1 fs0_12 = fs0_1.c;
        this.b = object = new js0_1(fs0_12);
        this.c = object = new Np(0);
        this.d = object = new DragAndDropModifierOnDragListener$modifier$1(this);
    }

    public final void a(Es0 es0) {
        this.c.add(es0);
    }

    public final boolean b(Es0 es0) {
        return this.c.contains(es0);
    }

    public final boolean onDrag(View object, DragEvent object2) {
        object = new cs0_0((DragEvent)object2);
        int n3 = object2.getAction();
        boolean bl2 = false;
        is0_0 is0_02 = null;
        Object object3 = this.b;
        switch (n3) {
            default: {
                break;
            }
            case 6: {
                ((js0_1)object3).K0((cs0_0)object);
                break;
            }
            case 5: {
                ((js0_1)object3).C((cs0_0)object);
                break;
            }
            case 4: {
                ((js0_1)object3).I((cs0_0)object);
                break;
            }
            case 3: {
                bl2 = ((js0_1)object3).k0((cs0_0)object);
                break;
            }
            case 2: {
                ((js0_1)object3).R0((cs0_0)object);
                break;
            }
            case 1: {
                object3.getClass();
                object2 = new Ref$BooleanRef();
                is0_02 = new is0_0((cs0_0)object, (js0_1)object3, (Ref$BooleanRef)object2);
                Object object4 = is0_02.invoke(object3);
                Xr3 xr3 = Xr3.ContinueTraversal;
                if (object4 == xr3) {
                    Zr3.d((yr3_0)object3, is0_02);
                }
                bl2 = ((Ref$BooleanRef)object2).element;
                object2 = this.c;
                object2.getClass();
                object3 = new Np$a((Np)object2);
                while ((n3 = (int)(((gg1_1)object3).hasNext() ? 1 : 0)) != 0) {
                    object2 = (Es0)((gg1_1)object3).next();
                    object2.b0((cs0_0)object);
                }
                break block0;
            }
        }
        return bl2;
    }
}

