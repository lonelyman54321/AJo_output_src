/*
 * Decompiled with CFR 0.152.
 */
import com.caverock.androidsvg.SVGParseException;
import org.xml.sax.SAXException;

public abstract class rR2$Y
extends rR2$H {
    public final void g(rR2$N object) {
        boolean bl2 = object instanceof rR2$X;
        if (bl2) {
            this.i.add(object);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Text content elements cannot contain ");
        stringBuilder.append(object);
        stringBuilder.append(" elements.");
        object = stringBuilder.toString();
        SVGParseException sVGParseException = new SAXException((String)object);
        throw sVGParseException;
    }
}

