/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Ticker;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilder$OneWeigher;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.ForwardingCache;
import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.Weigher;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class LocalCache$ManualSerializationProxy
extends ForwardingCache
implements Serializable {
    private static final long serialVersionUID = 1L;
    final int concurrencyLevel;
    transient Cache delegate;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final Equivalence keyEquivalence;
    final LocalCache$Strength keyStrength;
    final CacheLoader loader;
    final long maxWeight;
    final RemovalListener removalListener;
    final Ticker ticker;
    final Equivalence valueEquivalence;
    final LocalCache$Strength valueStrength;
    final Weigher weigher;

    private LocalCache$ManualSerializationProxy(LocalCache$Strength object, LocalCache$Strength localCache$Strength, Equivalence equivalence, Equivalence equivalence2, long l2, long l3, long l4, Weigher weigher, int n3, RemovalListener removalListener, Ticker ticker, CacheLoader cacheLoader) {
        this.keyStrength = object;
        this.valueStrength = localCache$Strength;
        this.keyEquivalence = equivalence;
        this.valueEquivalence = equivalence2;
        this.expireAfterWriteNanos = l2;
        this.expireAfterAccessNanos = l3;
        this.maxWeight = l4;
        this.weigher = weigher;
        this.concurrencyLevel = n3;
        this.removalListener = removalListener;
        object = Ticker.systemTicker();
        if (ticker == object || ticker == (object = CacheBuilder.NULL_TICKER)) {
            ticker = null;
        }
        this.ticker = ticker;
        this.loader = cacheLoader;
    }

    public LocalCache$ManualSerializationProxy(LocalCache localCache) {
        LocalCache$Strength localCache$Strength = localCache.keyStrength;
        LocalCache$Strength localCache$Strength2 = localCache.valueStrength;
        Equivalence equivalence = localCache.keyEquivalence;
        Equivalence equivalence2 = localCache.valueEquivalence;
        long l2 = localCache.expireAfterWriteNanos;
        long l3 = localCache.expireAfterAccessNanos;
        long l4 = localCache.maxWeight;
        Weigher weigher = localCache.weigher;
        int n3 = localCache.concurrencyLevel;
        RemovalListener removalListener = localCache.removalListener;
        Ticker ticker = localCache.ticker;
        CacheLoader cacheLoader = localCache.defaultLoader;
        this(localCache$Strength, localCache$Strength2, equivalence, equivalence2, l2, l3, l4, weigher, n3, removalListener, ticker, cacheLoader);
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        this.delegate = object = this.recreateCacheBuilder().build();
    }

    private Object readResolve() {
        return this.delegate;
    }

    public Cache delegate() {
        return this.delegate;
    }

    public CacheBuilder recreateCacheBuilder() {
        long l2;
        CacheBuilder cacheBuilder = CacheBuilder.newBuilder();
        Object object = this.keyStrength;
        cacheBuilder = cacheBuilder.setKeyStrength((LocalCache$Strength)((Object)object));
        object = this.valueStrength;
        cacheBuilder = cacheBuilder.setValueStrength((LocalCache$Strength)((Object)object));
        object = this.keyEquivalence;
        cacheBuilder = cacheBuilder.keyEquivalence((Equivalence)object);
        object = this.valueEquivalence;
        cacheBuilder = cacheBuilder.valueEquivalence((Equivalence)object);
        int n3 = this.concurrencyLevel;
        cacheBuilder = cacheBuilder.concurrencyLevel(n3);
        object = this.removalListener;
        cacheBuilder = cacheBuilder.removalListener((RemovalListener)object);
        n3 = 0;
        object = null;
        cacheBuilder.strictParsing = false;
        long l3 = this.expireAfterWriteNanos;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            cacheBuilder.expireAfterWrite(l3, timeUnit);
        }
        if ((object2 = (l2 = (l3 = this.expireAfterAccessNanos) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            cacheBuilder.expireAfterAccess(l3, timeUnit);
        }
        object = this.weigher;
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher = CacheBuilder$OneWeigher.INSTANCE;
        l4 = -1;
        if (object != cacheBuilder$OneWeigher) {
            cacheBuilder.weigher((Weigher)object);
            l3 = this.maxWeight;
            object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object2 != false) {
                cacheBuilder.maximumWeight(l3);
            }
        } else {
            l3 = this.maxWeight;
            long l8 = l3 - l4;
            object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false) {
                cacheBuilder.maximumSize(l3);
            }
        }
        if ((object = this.ticker) != null) {
            cacheBuilder.ticker((Ticker)object);
        }
        return cacheBuilder;
    }
}

