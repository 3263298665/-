package com.chen.cloudshadow.service.impl;

import com.chen.cloudshadow.pojo.Movies;
import com.chen.cloudshadow.mapper.MoviesMapper;
import com.chen.cloudshadow.service.IMoviesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电影表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Service
public class MoviesServiceImpl extends ServiceImpl<MoviesMapper, Movies> implements IMoviesService {

}
