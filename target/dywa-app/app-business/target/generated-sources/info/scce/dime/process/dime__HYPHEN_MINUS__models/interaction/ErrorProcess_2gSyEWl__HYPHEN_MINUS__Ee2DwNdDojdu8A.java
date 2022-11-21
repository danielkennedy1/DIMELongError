package info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import info.scce.dime.exception.GUIEncounteredSignal;
import info.scce.dime.exception.GUIEncounteredSignal.GUIInfo;
import info.scce.dime.process.CallFrame;
import info.scce.dime.process.DIMEProcess;
import info.scce.dime.process.DIMEProcessContext;
import info.scce.dime.process.JSONContext;
import info.scce.dime.process.ProcessCallFrame;
import info.scce.dime.util.CDIUtil;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public final class ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8A implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				private int counterIterate_A9cGYWl_Ee2DwNdDojdu8A = 0;
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.counterIterate_A9cGYWl_Ee2DwNdDojdu8A = ctx.counterIterate_A9cGYWl_Ee2DwNdDojdu8A;

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;



					result.counterIterate_A9cGYWl_Ee2DwNdDojdu8A = this.counterIterate_A9cGYWl_Ee2DwNdDojdu8A;

					return result;
		        }
			}

	// attributes shaping the context variables.
	public static class Context implements DIMEProcessContext {

		// bean manager
		private BeanManager beanManager;
		
		// current eventID
		private String eventId;
		
		// last MajorSIBId
		private String lastMajorSIBId;
		
		// current MajorGUI
		private GUIInfo majorGUIState = null;

		// stack variables
		private ProcessCallFrame callStack = new ProcessCallFrame();

		// direct dataflow variables.
		private List<java.lang.Long> IntegerListSuccessResult_5m6kwWl__HYPHEN_MINUS__Ee2DwNdDojdu8A = new ArrayList<>();
		private java.lang.Long IterateNextElement_A9__HYPHEN_MINUS__R4Wl_Ee2DwNdDojdu8A;
		// index variables of iterate sibs.
		private int counterIterate_A9cGYWl_Ee2DwNdDojdu8A = 0;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_2hCY8Wl__HYPHEN_MINUS__Ee2DwNdDojdu8A,
	_5l_XsWl__HYPHEN_MINUS__Ee2DwNdDojdu8A,
	__hbbYGl__HYPHEN_MINUS__Ee2DwNdDojdu8A,
	_A9cGYWl_Ee2DwNdDojdu8A,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8A(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8AResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._5l_XsWl__HYPHEN_MINUS__Ee2DwNdDojdu8A);
	}
	
	

	@Override
	public ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8AResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8AResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _2hCY8Wl__HYPHEN_MINUS__Ee2DwNdDojdu8A: {
					return execute_2hCY8Wl__HYPHEN_MINUS__Ee2DwNdDojdu8A(ctx);
				}
				case _5l_XsWl__HYPHEN_MINUS__Ee2DwNdDojdu8A: {
					curr = execute_5l_XsWl__HYPHEN_MINUS__Ee2DwNdDojdu8A(ctx);
					break;
				}
				case __hbbYGl__HYPHEN_MINUS__Ee2DwNdDojdu8A: {
					curr = execute__hbbYGl__HYPHEN_MINUS__Ee2DwNdDojdu8A(ctx);
					break;
				}
				case _A9cGYWl_Ee2DwNdDojdu8A: {
					curr = execute_A9cGYWl_Ee2DwNdDojdu8A(ctx);
					break;
				}
				default: {
					throw new IllegalStateException("unhandled SIB container " + curr);
				}
			}
		}
	}
	
	/**
	 * The return type for this process. It stores the corresponding branch name 
	 * as well as the corresponding result for the branch.
	 */
	public static class ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8AResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8AResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_2hCY8Wl__HYPHEN_MINUS__Ee2DwNdDojdu8A";
			this.success = success;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public SuccessReturn getSuccessReturn() {
			return success;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>success</code>.
		 */
		public interface SuccessReturn {
		}
	
		/**
		 * Return type of branch <code>success</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class SuccessReturnImpl implements SuccessReturn {

			private final Context ctx;

	        SuccessReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// container for graph i/o 'success'.
	public ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8AResult execute_2hCY8Wl__HYPHEN_MINUS__Ee2DwNdDojdu8A(final Context ctx) {
		return new ErrorProcess_2gSyEWl__HYPHEN_MINUS__Ee2DwNdDojdu8AResult(new SuccessReturnImpl(ctx));
	}
	// container for atomic SIB 'IntegerList'.
	public SIB_ID execute_5l_XsWl__HYPHEN_MINUS__Ee2DwNdDojdu8A(final Context ctx) {
		try {
			final List<java.lang.Long> result = info.scce.dime.app.demo.Native.getIntegerList();
			List<java.lang.Long> value1 = result;
			if (value1 != null) { // prevent null in lists
			ctx.IntegerListSuccessResult_5m6kwWl__HYPHEN_MINUS__Ee2DwNdDojdu8A = new ArrayList<java.lang.Long>(value1);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'IntegerList' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._A9cGYWl_Ee2DwNdDojdu8A;
	}
	// container for atomic SIB 'PrintInteger'.
	public SIB_ID execute__hbbYGl__HYPHEN_MINUS__Ee2DwNdDojdu8A(final Context ctx) {
		try {
			info.scce.dime.app.demo.Native.printInteger(ctx.IterateNextElement_A9__HYPHEN_MINUS__R4Wl_Ee2DwNdDojdu8A);
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'PrintInteger' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._A9cGYWl_Ee2DwNdDojdu8A;
	}
	// container for iterate primitive SIB 'Iterate'.
	public SIB_ID execute_A9cGYWl_Ee2DwNdDojdu8A(final Context ctx) {
		final int pos = ctx.counterIterate_A9cGYWl_Ee2DwNdDojdu8A++;
		List<java.lang.Long> list = ctx.IntegerListSuccessResult_5m6kwWl__HYPHEN_MINUS__Ee2DwNdDojdu8A;
		if(list != null && pos < list.size()) {
			ctx.IterateNextElement_A9__HYPHEN_MINUS__R4Wl_Ee2DwNdDojdu8A = ctx.IntegerListSuccessResult_5m6kwWl__HYPHEN_MINUS__Ee2DwNdDojdu8A.get(pos);
			// branch 'next'
			return SIB_ID.__hbbYGl__HYPHEN_MINUS__Ee2DwNdDojdu8A;
		}
		else {
			ctx.counterIterate_A9cGYWl_Ee2DwNdDojdu8A = 0;
			// branch 'exit'
			return SIB_ID._2hCY8Wl__HYPHEN_MINUS__Ee2DwNdDojdu8A;
		}
		
	}
	
}  
