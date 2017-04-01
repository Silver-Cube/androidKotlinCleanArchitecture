package com.rantolin.cleanarchitecture.domain.exception

/**
 * Wrapper around Exceptions used to manage default errors.
 */
class DefaultErrorBundle(override val exception: Exception) : ErrorBundle {

    override val errorMessage: String
        get() = this.exception.message!!

}
