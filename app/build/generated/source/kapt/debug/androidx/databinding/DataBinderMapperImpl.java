package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.kelvinwachiye.kotlin.moviedb.DataBinderMapperImpl());
  }
}
