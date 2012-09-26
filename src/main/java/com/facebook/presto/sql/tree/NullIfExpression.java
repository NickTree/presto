package com.facebook.presto.sql.tree;

import com.google.common.base.Objects;

/**
 * NULLIF(V1,V2): CASE WHEN V1=V2 THEN NULL ELSE V1 END
 */
public class NullIfExpression
        extends Expression
{
    private final Expression first;
    private final Expression second;

    public NullIfExpression(Expression first, Expression second)
    {
        this.first = first;
        this.second = second;
    }

    public Expression getFirst()
    {
        return first;
    }

    public Expression getSecond()
    {
        return second;
    }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this)
                .add("first", first)
                .add("second", second)
                .toString();
    }
}
