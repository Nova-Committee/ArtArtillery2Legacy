package committee.nova.aa2.common.item.api

import net.minecraft.block.Block
import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.{Item, ItemStack}


class ItemMeleeless extends Item {
  override def canHarvestBlock(par1Block: Block, itemStack: ItemStack): Boolean = false

  override def canItemEditBlocks: Boolean = false

  override def onLeftClickEntity(stack: ItemStack, player: EntityPlayer, entity: Entity): Boolean = true

  override def func_150893_a(stack: ItemStack, block: Block): Float = 0

  override def getMaxItemUseDuration(stack: ItemStack): Int = 72000
}
