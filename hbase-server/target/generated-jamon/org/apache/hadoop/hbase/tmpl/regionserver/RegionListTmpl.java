// Autogenerated Jamon proxy
// /home/qls/workspace3/hbase-1.0.2/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/regionserver/RegionListTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 24, 9
import java.util.*;
// 25, 9
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
// 26, 9
import org.apache.hadoop.hbase.regionserver.HRegionServer;
// 27, 9
import org.apache.hadoop.hbase.util.Bytes;
// 28, 9
import org.apache.hadoop.hbase.HRegionInfo;
// 29, 9
import org.apache.hadoop.hbase.regionserver.HRegion;
// 30, 9
import org.apache.hadoop.hbase.ServerName;
// 31, 9
import org.apache.hadoop.hbase.HBaseConfiguration;
// 32, 9
import org.apache.hadoop.hbase.protobuf.ProtobufUtil;
// 33, 9
import org.apache.hadoop.hbase.protobuf.generated.AdminProtos.ServerInfo;
// 34, 9
import org.apache.hadoop.hbase.protobuf.generated.ClusterStatusProtos.RegionLoad;
// 35, 9
import org.apache.hadoop.hbase.client.RegionReplicaUtil;
// 36, 9
import org.apache.hadoop.hbase.regionserver.MetricsRegionWrapper;

@org.jamon.annotations.Template(
  signature = "453B1D06C1C069660F1255077D1DC0CE",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "regionServer", type = "HRegionServer"),
    @org.jamon.annotations.Argument(name = "onlineRegions", type = "List<HRegionInfo>")})
public class RegionListTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public RegionListTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  public RegionListTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/regionserver/RegionListTmpl");
  }
  
  protected interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf{
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 20, 9
    public void setRegionServer(HRegionServer regionServer)
    {
      // 20, 9
      m_regionServer = regionServer;
    }
    public HRegionServer getRegionServer()
    {
      return m_regionServer;
    }
    private HRegionServer m_regionServer;
    // 21, 9
    public void setOnlineRegions(List<HRegionInfo> onlineRegions)
    {
      // 21, 9
      m_onlineRegions = onlineRegions;
    }
    public List<HRegionInfo> getOnlineRegions()
    {
      return m_onlineRegions;
    }
    private List<HRegionInfo> m_onlineRegions;
  }
  @Override
  protected ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override @SuppressWarnings("unchecked") public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new RegionListTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HRegionServer regionServer, final List<HRegionInfo> onlineRegions)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, regionServer, onlineRegions);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HRegionServer regionServer, final List<HRegionInfo> onlineRegions)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, regionServer, onlineRegions);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HRegionServer regionServer, final List<HRegionInfo> onlineRegions)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setRegionServer(regionServer);
    implData.setOnlineRegions(onlineRegions);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
