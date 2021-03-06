package org.mo.game.editor.face.editor.storage;

import org.mo.web.protocol.context.IWebContext;
import org.mo.web.protocol.context.IWebInput;
import org.mo.web.protocol.context.IWebOutput;

public interface IStorageService{

   void catalog(IWebContext context,
                IWebInput input,
                IWebOutput output);

   void delete(IWebContext context,
               IWebInput input,
               IWebOutput output);

   void insert(IWebContext context,
               IWebInput input,
               IWebOutput output);

   void list(IWebContext context,
             IWebInput input,
             IWebOutput output);

   void sort(IWebContext context,
              IWebInput input,
              IWebOutput output);

   void update(IWebContext context,
               IWebInput input,
               IWebOutput output);
}
