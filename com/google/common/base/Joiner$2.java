/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Joiner;
import com.google.common.base.Joiner$MapJoiner;
import com.google.common.base.Preconditions;
import java.util.Iterator;

class Joiner$2
extends Joiner {
    final /* synthetic */ Joiner this$0;

    public Joiner$2(Joiner joiner, Joiner joiner2) {
        this.this$0 = joiner;
        super(joiner2, null);
    }

    public Appendable appendTo(Appendable appendable, Iterator iterator) {
        Object object;
        boolean bl2;
        Preconditions.checkNotNull(appendable, "appendable");
        CharSequence charSequence = "parts";
        Preconditions.checkNotNull(iterator, charSequence);
        while (bl2 = iterator.hasNext()) {
            charSequence = iterator.next();
            if (charSequence == null) continue;
            object = this.this$0;
            charSequence = ((Joiner)object).toString(charSequence);
            appendable.append(charSequence);
            break;
        }
        while (bl2 = iterator.hasNext()) {
            charSequence = iterator.next();
            if (charSequence == null) continue;
            object = Joiner.access$100(this.this$0);
            appendable.append((CharSequence)object);
            object = this.this$0;
            charSequence = ((Joiner)object).toString(charSequence);
            appendable.append(charSequence);
        }
        return appendable;
    }

    public Joiner useForNull(String object) {
        object = new UnsupportedOperationException("already specified skipNulls");
        throw object;
    }

    public Joiner$MapJoiner withKeyValueSeparator(String object) {
        object = new UnsupportedOperationException("can't use .skipNulls() with maps");
        throw object;
    }
}

