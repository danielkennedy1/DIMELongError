// generated by SelectiveGenerator#generateFullSelective(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class ConcreteUserSelective {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser from,
		final de.ls5.dywa.generated.rest.types.ConcreteUser to,
		final info.scce.dime.rest.ObjectCache objectCache) {


		if (objectCache.containsSelective(to, "ConcreteUserSelective")) {
			return;
		}

		to.setDywaId(from.getDywaId());

		// put to cache, after id has been set
		objectCache.putSelective(to, "ConcreteUserSelective");

		// non-transient objects can be fetched completely from the DB
		if (from.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return;
		}

		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());

		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.ConcreteUser effectiveTo = to;
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser
		 source = effectiveFrom.getbaseUser();
		if (source != null) {
			// original selective: BaseUserSelective
			de.ls5.dywa.generated.rest.types.BaseUser cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.BaseUser.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "BaseUserSelective")) {
				de.ls5.dywa.generated.rest.types.BaseUserSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setbaseUser(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.ConcreteUser effectiveTo = to;
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser
		 source = effectiveFrom.getdywaSwitchedTo();
		if (source != null) {
			// original selective: ConcreteUserSelective
			de.ls5.dywa.generated.rest.types.ConcreteUser cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.ConcreteUser.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "ConcreteUserSelective")) {
				de.ls5.dywa.generated.rest.types.ConcreteUserSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setdywaSwitchedTo(cached);
		}
		}
	}
}
