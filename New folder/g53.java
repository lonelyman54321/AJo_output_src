/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g53
extends LP1$c
implements rp1_1 {
    public long A;
    public long B;
    public int C;
    public f53 D;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public i13 y;
    public boolean z;

    public final boolean g1() {
        return false;
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        object = object.Q(l2);
        int n3 = ((Ns2)object).a;
        int n4 = ((Ns2)object).b;
        g53$a g53$a = new g53$a((Ns2)object, this);
        return cl1_0.a(dl1_12, n3, n4, g53$a);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        float f5 = this.n;
        stringBuilder.append(f5);
        stringBuilder.append(", scaleY=");
        f5 = this.o;
        stringBuilder.append(f5);
        stringBuilder.append(", alpha = ");
        f5 = this.p;
        stringBuilder.append(f5);
        stringBuilder.append(", translationX=");
        f5 = this.q;
        stringBuilder.append(f5);
        stringBuilder.append(", translationY=");
        f5 = this.r;
        stringBuilder.append(f5);
        stringBuilder.append(", shadowElevation=");
        f5 = this.s;
        stringBuilder.append(f5);
        stringBuilder.append(", rotationX=");
        f5 = this.t;
        stringBuilder.append(f5);
        stringBuilder.append(", rotationY=");
        f5 = this.u;
        stringBuilder.append(f5);
        stringBuilder.append(", rotationZ=");
        f5 = this.v;
        stringBuilder.append(f5);
        stringBuilder.append(", cameraDistance=");
        f5 = this.w;
        stringBuilder.append(f5);
        stringBuilder.append(", transformOrigin=");
        Object object = Oq3.d(this.x);
        stringBuilder.append(object);
        stringBuilder.append(", shape=");
        object = this.y;
        stringBuilder.append(object);
        stringBuilder.append(", clip=");
        boolean c2 = this.z;
        stringBuilder.append(c2);
        stringBuilder.append(", renderEffect=null, ambientShadowColor=");
        object = OX.i(this.A);
        stringBuilder.append(object);
        stringBuilder.append(", spotShadowColor=");
        object = OX.i(this.B);
        stringBuilder.append(object);
        stringBuilder.append(", compositingStrategy=");
        int n3 = this.C;
        CharSequence charSequence = new StringBuilder("CompositingStrategy(value=");
        charSequence.append(n3);
        char c3 = ')';
        charSequence.append(c3);
        charSequence = charSequence.toString();
        stringBuilder.append((Object)charSequence);
        stringBuilder.append(c3);
        return stringBuilder.toString();
    }
}

