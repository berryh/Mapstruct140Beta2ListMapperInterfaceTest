package net.berryh.mapstructbugtest;

import java.io.Serializable;
import java.util.List;

import org.mapstruct.IterableMapping;

public interface ListConverter<T extends Serializable, TO>
{
	T toType(TO source);

	TO toTO(T source);

	@IterableMapping(qualifiedByName = "toType")
	List<T> toType(List<TO> source);

	@IterableMapping(qualifiedByName = "toTO")
	List<TO> toTO(List<T> source);
}
