/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.EmptyImmutableListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableListMultimap$Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap$FieldSettersHolder;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Serialization;
import com.google.common.collect.UnmodifiableIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ImmutableListMultimap
extends ImmutableMultimap
implements ListMultimap {
    private static final long serialVersionUID;
    private transient ImmutableListMultimap inverse;

    public ImmutableListMultimap(ImmutableMap immutableMap, int n3) {
        super(immutableMap, n3);
    }

    public static ImmutableListMultimap$Builder builder() {
        ImmutableListMultimap$Builder immutableListMultimap$Builder = new ImmutableListMultimap$Builder();
        return immutableListMultimap$Builder;
    }

    public static ImmutableListMultimap copyOf(Multimap multimap) {
        boolean bl2 = multimap.isEmpty();
        if (bl2) {
            return ImmutableListMultimap.of();
        }
        bl2 = multimap instanceof ImmutableListMultimap;
        if (bl2) {
            Multimap multimap2 = multimap;
            multimap2 = (ImmutableListMultimap)multimap;
            boolean bl3 = ((ImmutableMultimap)multimap2).isPartialView();
            if (!bl3) {
                return multimap2;
            }
        }
        return ImmutableListMultimap.fromMapEntries(multimap.asMap().entrySet(), null);
    }

    public static ImmutableListMultimap copyOf(Iterable iterable) {
        ImmutableListMultimap$Builder immutableListMultimap$Builder = new ImmutableListMultimap$Builder();
        return immutableListMultimap$Builder.putAll(iterable).build();
    }

    public static ImmutableListMultimap fromMapEntries(Collection object, Comparator object2) {
        int n3;
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return ImmutableListMultimap.of();
        }
        int n4 = object.size();
        ImmutableMap$Builder immutableMap$Builder = new ImmutableMap$Builder(n4);
        object = object.iterator();
        n4 = 0;
        while ((n3 = object.hasNext()) != 0) {
            Object object3 = (Map.Entry)object.next();
            Object k2 = object3.getKey();
            object3 = (Collection)object3.getValue();
            object3 = object2 == null ? ImmutableList.copyOf((Collection)object3) : ImmutableList.sortedCopyOf((Comparator)object2, (Iterable)object3);
            boolean bl3 = ((AbstractCollection)object3).isEmpty();
            if (bl3) continue;
            immutableMap$Builder.put(k2, object3);
            n4 = n3 = ((AbstractCollection)object3).size() + n4;
        }
        object2 = immutableMap$Builder.buildOrThrow();
        object = new ImmutableListMultimap((ImmutableMap)object2, n4);
        return object;
    }

    private ImmutableListMultimap invert() {
        boolean bl2;
        Object object = ImmutableListMultimap.builder();
        UnmodifiableIterator unmodifiableIterator = this.entries().iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            Map.Entry entry = (Map.Entry)unmodifiableIterator.next();
            Object v4 = entry.getValue();
            entry = entry.getKey();
            ((ImmutableListMultimap$Builder)object).put(v4, entry);
        }
        object = ((ImmutableListMultimap$Builder)object).build();
        ((ImmutableListMultimap)object).inverse = this;
        return object;
    }

    public static ImmutableListMultimap of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    public static ImmutableListMultimap of(Object object, Object object2) {
        ImmutableListMultimap$Builder immutableListMultimap$Builder = ImmutableListMultimap.builder();
        immutableListMultimap$Builder.put(object, object2);
        return immutableListMultimap$Builder.build();
    }

    public static ImmutableListMultimap of(Object object, Object object2, Object object3, Object object4) {
        ImmutableListMultimap$Builder immutableListMultimap$Builder = ImmutableListMultimap.builder();
        immutableListMultimap$Builder.put(object, object2);
        immutableListMultimap$Builder.put(object3, object4);
        return immutableListMultimap$Builder.build();
    }

    public static ImmutableListMultimap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        ImmutableListMultimap$Builder immutableListMultimap$Builder = ImmutableListMultimap.builder();
        immutableListMultimap$Builder.put(object, object2);
        immutableListMultimap$Builder.put(object3, object4);
        immutableListMultimap$Builder.put(object5, object6);
        return immutableListMultimap$Builder.build();
    }

    public static ImmutableListMultimap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        ImmutableListMultimap$Builder immutableListMultimap$Builder = ImmutableListMultimap.builder();
        immutableListMultimap$Builder.put(object, object2);
        immutableListMultimap$Builder.put(object3, object4);
        immutableListMultimap$Builder.put(object5, object6);
        immutableListMultimap$Builder.put(object7, object8);
        return immutableListMultimap$Builder.build();
    }

    public static ImmutableListMultimap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        ImmutableListMultimap$Builder immutableListMultimap$Builder = ImmutableListMultimap.builder();
        immutableListMultimap$Builder.put(object, object2);
        immutableListMultimap$Builder.put(object3, object4);
        immutableListMultimap$Builder.put(object5, object6);
        immutableListMultimap$Builder.put(object7, object8);
        immutableListMultimap$Builder.put(object9, object10);
        return immutableListMultimap$Builder.build();
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        int n3 = ((ObjectInputStream)object).readInt();
        if (n3 >= 0) {
            Object object2 = ImmutableMap.builder();
            int n4 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object3 = ((ObjectInputStream)object).readObject();
                Objects.requireNonNull(object3);
                int n7 = ((ObjectInputStream)object).readInt();
                if (n7 > 0) {
                    Object object4 = ImmutableList.builder();
                    for (int i8 = 0; i8 < n7; ++i8) {
                        Object object5 = ((ObjectInputStream)object).readObject();
                        Objects.requireNonNull(object5);
                        ((ImmutableList$Builder)object4).add(object5);
                    }
                    object4 = ((ImmutableList$Builder)object4).build();
                    ((ImmutableMap$Builder)object2).put(object3, object4);
                    n4 += n7;
                    continue;
                }
                String string2 = hj0_0.a(n7, "Invalid value count ");
                object = new InvalidObjectException(string2);
                throw object;
            }
            try {
                object = ((ImmutableMap$Builder)object2).buildOrThrow();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = illegalArgumentException.getMessage();
                InvalidObjectException invalidObjectException = new InvalidObjectException((String)object2);
                throw (InvalidObjectException)invalidObjectException.initCause(illegalArgumentException);
            }
            ImmutableMultimap$FieldSettersHolder.MAP_FIELD_SETTER.set((Object)this, object);
            ImmutableMultimap$FieldSettersHolder.SIZE_FIELD_SETTER.set((Object)this, n4);
            return;
        }
        String string3 = hj0_0.a(n3, "Invalid key count ");
        object = new InvalidObjectException(string3);
        throw object;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    public ImmutableList get(Object object) {
        ImmutableMap immutableMap = this.map;
        if ((object = (ImmutableList)immutableMap.get(object)) == null) {
            object = ImmutableList.of();
        }
        return object;
    }

    public ImmutableListMultimap inverse() {
        ImmutableListMultimap immutableListMultimap = this.inverse;
        if (immutableListMultimap == null) {
            this.inverse = immutableListMultimap = this.invert();
        }
        return immutableListMultimap;
    }

    public final ImmutableList removeAll(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final ImmutableList replaceValues(Object object, Iterable iterable) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

