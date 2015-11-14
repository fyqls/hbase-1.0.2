// Autogenerated Jamon proxy
// /home/qls/workspace3/hbase-1.0.2/hbase-server/src/main/jamon/org/apache/hadoop/hbase/tmpl/regionserver/BlockCacheViewTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 28, 1
import java.util.*;
// 29, 1
import org.apache.hadoop.conf.Configuration;
// 30, 1
import org.apache.hadoop.hbase.io.hfile.BlockCacheUtil.CachedBlocksByFile;
// 31, 1
import org.apache.hadoop.hbase.io.hfile.BlockCacheUtil;
// 32, 1
import org.apache.hadoop.hbase.io.hfile.CachedBlock;
// 33, 1
import org.apache.hadoop.hbase.io.hfile.CacheConfig;
// 34, 1
import org.apache.hadoop.hbase.io.hfile.BlockCache;
// 35, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCacheStats;
// 36, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCache;
// 37, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator;
// 38, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator.Bucket;
// 39, 1
import org.apache.hadoop.util.StringUtils;
// 40, 1
import com.yammer.metrics.stats.Snapshot;

@org.jamon.annotations.Template(
  signature = "55F24C2DE80855032635C8D7EC699979",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "cacheConfig", type = "CacheConfig"),
    @org.jamon.annotations.Argument(name = "conf", type = "Configuration"),
    @org.jamon.annotations.Argument(name = "bcn", type = "String"),
    @org.jamon.annotations.Argument(name = "bcv", type = "String")})
public class BlockCacheViewTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public BlockCacheViewTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  public BlockCacheViewTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/regionserver/BlockCacheViewTmpl");
  }
  
  protected interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf{
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 22, 1
    public void setCacheConfig(CacheConfig cacheConfig)
    {
      // 22, 1
      m_cacheConfig = cacheConfig;
    }
    public CacheConfig getCacheConfig()
    {
      return m_cacheConfig;
    }
    private CacheConfig m_cacheConfig;
    // 23, 1
    public void setConf(Configuration conf)
    {
      // 23, 1
      m_conf = conf;
    }
    public Configuration getConf()
    {
      return m_conf;
    }
    private Configuration m_conf;
    // 24, 1
    public void setBcn(String bcn)
    {
      // 24, 1
      m_bcn = bcn;
    }
    public String getBcn()
    {
      return m_bcn;
    }
    private String m_bcn;
    // 25, 1
    public void setBcv(String bcv)
    {
      // 25, 1
      m_bcv = bcv;
    }
    public String getBcv()
    {
      return m_bcv;
    }
    private String m_bcv;
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
    return new BlockCacheViewTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final CacheConfig cacheConfig, final Configuration conf, final String bcn, final String bcv)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, cacheConfig, conf, bcn, bcv);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final CacheConfig cacheConfig, final Configuration conf, final String bcn, final String bcv)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, cacheConfig, conf, bcn, bcv);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final CacheConfig cacheConfig, final Configuration conf, final String bcn, final String bcv)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setCacheConfig(cacheConfig);
    implData.setConf(conf);
    implData.setBcn(bcn);
    implData.setBcv(bcv);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
