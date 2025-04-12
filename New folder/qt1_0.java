/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qt1
 */
public abstract class qt1_0
implements zt2_0 {
    public Qt1$a a;

    public /* synthetic */ void a() {
    }

    public final void e() {
        Object object = this.a;
        if (object != null && (object = object.getSoftwareKeyboardController()) != null) {
            object.hide();
        }
    }

    public /* synthetic */ void f(aG2 aG22) {
    }

    public final void g() {
        Object object = this.a;
        if (object != null && (object = object.getSoftwareKeyboardController()) != null) {
            object.show();
        }
    }

    public /* synthetic */ void h(ql3_0 ql3_02, i72 i722, Tl3 tl3, ek3_0 ek3_02, aG2 aG22, aG2 aG23) {
    }

    public abstract void i();

    public final void j(Qt1$a object) {
        Object object2 = this.a;
        if (object2 == object) {
            this.a = null;
            return;
        }
        object2 = new StringBuilder("Expected textInputModifierNode to be ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" but was ");
        object = this.a;
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

