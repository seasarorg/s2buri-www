/*
 * �쐬��: 2006/04/01
 *
 */
package org.seasar.buri.engine;

import java.util.Map;

import org.seasar.buri.util.packages.BuriExePackages;
import org.seasar.buri.util.packages.BuriExecProcess;

public interface WakanagoEngine {
    BuriUserContext createUserContext(Object data,Object userData,Object action,Map context);
    BuriSystemContext createSystemContext(String buriPath,BuriUserContext userContext);
    Object execute(BuriSystemContext sysContext,String resultScript);
    
    BuriExecProcess selectDirectProcess(BuriPath path);
    BuriExePackages selectPackage(BuriSystemContext sysContext);
    BuriExecProcess selectProcess(BuriExePackages wPackageObj,BuriSystemContext sysContext);
    
    void readWorkFlowFromResource(String workFlowName,String resourceName);
    void readWorkFlowFromResource(String workFlowName,String resourceName,ParticipantProvider provider);
    boolean hasPackage(String packageName);
}
